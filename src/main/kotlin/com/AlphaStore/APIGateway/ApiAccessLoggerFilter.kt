package com.AlphaStore.APIGateway

import com.AlphaStore.Utils.ipmonitor.GenericLogsMaster
import com.alphaStore.Core.enums.ApiTire
import com.alphaStore.Core.enums.HttpMethod
import com.alphaStore.Utils.KeywordsAndConstants
import com.alphaStore.Utils.contracts.BadRequestException
import com.alphaStore.Utils.ipmonitor.IPResolver
import com.alphaStore.Utils.jwtUtilMaster.JwtUtilMaster
import org.reactivestreams.Publisher
import org.springframework.cloud.gateway.filter.GatewayFilter
import org.springframework.cloud.gateway.filter.GatewayFilterChain
import org.springframework.core.io.buffer.DataBuffer
import org.springframework.http.server.reactive.ServerHttpRequest
import org.springframework.http.server.reactive.ServerHttpRequestDecorator
import org.springframework.http.server.reactive.ServerHttpResponse
import org.springframework.http.server.reactive.ServerHttpResponseDecorator
import org.springframework.web.server.ServerWebExchange
import org.springframework.web.server.ServerWebExchangeDecorator
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.nio.charset.StandardCharsets
import java.util.*

class ApiAccessLoggerFilter(
    private val jwtUtilMaster: JwtUtilMaster,
    private val genericLogsMaster: GenericLogsMaster,
    private val redisObjectMaster: RedisObjectMaster,
    private val accessControlRepoAggregatorContract: AccessControlRepoAggregatorContract,
    private val accessControlService: AccessControlService,
) : GatewayFilter {
    override fun filter(exchange: ServerWebExchange, chain: GatewayFilterChain): Mono<Void> {
        val ip = IPResolver.resolve(exchange)
        val newId =
            exchange.request.headers.getFirst(KeywordsAndConstants.HEADER_TRACKING_ID) ?: UUID.randomUUID().toString()
        val path = accessControlService.refinePath(exchange.request.path.toString())
        var token =
            exchange.request.headers.getFirst(KeywordsAndConstants.HEADER_AUTH_TOKEN) ?: ""
        token = token.replace(KeywordsAndConstants.TOKEN_PREFIX, "")
        val bodyCaptureExchange = BodyCaptureExchange(exchange)
        val apiTire = if (
            KeywordsAndConstants.NON_AUTH_APIS.split(",")
                .find { toFind -> toFind.contains(exchange.request.path.toString()) }
                ?.let { true }
                ?: run { false }
        ) {
            ApiTire.OPEN
        }else if (
            checkIfAccessControlIsInTire(KeywordsAndConstants.APIS_TIRE_TEN, exchange.request.path.toString())
        ) {
            ApiTire.TIRE_TEN
        }else if (
            checkIfAccessControlIsInTire(KeywordsAndConstants.APIS_TIRE_NINE, exchange.request.path.toString())
        ) {
            ApiTire.TIRE_NINE
        } else if (
            checkIfAccessControlIsInTire(KeywordsAndConstants.APIS_TIRE_EIGHT, exchange.request.path.toString())
        ) {
            ApiTire.TIRE_EIGHT
        }else if (
            checkIfAccessControlIsInTire(KeywordsAndConstants.APIS_TIRE_SEVEN, exchange.request.path.toString())
        ) {
            ApiTire.TIRE_SEVEN
        } else if (
            checkIfAccessControlIsInTire(KeywordsAndConstants.APIS_TIRE_SIX, exchange.request.path.toString())
        ) {
            ApiTire.TIRE_SIX
        } else if (
            checkIfAccessControlIsInTire(KeywordsAndConstants.APIS_TIRE_FIVE, exchange.request.path.toString())
        ) {
            ApiTire.TIRE_FIVE
        } else if (
            checkIfAccessControlIsInTire(KeywordsAndConstants.APIS_TIRE_FOUR, exchange.request.path.toString())
        ) {
            ApiTire.TIRE_FOUR
        } else if (
            checkIfAccessControlIsInTire(KeywordsAndConstants.APIS_TIRE_THREE, exchange.request.path.toString())
        ) {
            ApiTire.TIRE_THREE
        } else if (
            checkIfAccessControlIsInTire(KeywordsAndConstants.APIS_TIRE_TWO, exchange.request.path.toString())
        ) {
            ApiTire.TIRE_TWO
        } else {
            ApiTire.TIRE_ONE
        }

        return chain.filter(bodyCaptureExchange)
            .doOnSuccess { _ ->
                @Suppress("SENSELESS_COMPARISON")
                genericLogsMaster.addGenericLog(
                    apiUrl = path,
                    userId = if (token == "") null
                    else {
                        val body: HashMap<String, String> = jwtUtilMaster.getBodyFromJwtIgnoringExpiryDate(
                            token
                        )
                        val id = body["id"].toString()
                        id
                    },
                    clientDeviceId = jwtUtilMaster.mayGetClientDeviceId(token),
                    trackingId = newId,
                    apiTire = apiTire,
                    args = if (bodyCaptureExchange.request.fullBody == "")
                        bodyCaptureExchange.request.uri.toString()
                    else
                        bodyCaptureExchange.request.fullBody,
                    httpMethod = bodyCaptureExchange.request.method.let { httpMethodPositive ->
                        HttpMethod.valueOf(httpMethodPositive.name())
                    } ?: run {
                        null
                    },
                )
            }
    }

    class BodyCaptureExchange(exchange: ServerWebExchange) : ServerWebExchangeDecorator(exchange) {
        private var bodyCaptureRequest: BodyCaptureRequest
        private var bodyCaptureResponse: BodyCaptureResponse

        init {
            bodyCaptureRequest = BodyCaptureRequest(exchange.request)
            bodyCaptureResponse = BodyCaptureResponse(exchange.response)
        }

        override fun getRequest(): BodyCaptureRequest {
            return bodyCaptureRequest
        }

        override fun getResponse(): BodyCaptureResponse {
            return bodyCaptureResponse
        }
    }


    class BodyCaptureRequest(delegate: ServerHttpRequest) : ServerHttpRequestDecorator(delegate) {
        private val body = StringBuilder()
        override fun getBody(): Flux<DataBuffer> {
            return super.getBody().doOnNext { buffer: DataBuffer ->
                capture(
                    buffer
                )
            }
        }

        private fun capture(buffer: DataBuffer) {
            body.append(StandardCharsets.UTF_8.decode(buffer.asByteBuffer()).toString())
        }

        val fullBody: String
            get() = body.toString()
    }


    class BodyCaptureResponse(delegate: ServerHttpResponse) : ServerHttpResponseDecorator(delegate) {
        private val body = java.lang.StringBuilder()
        override fun writeWith(body: Publisher<out DataBuffer>): Mono<Void> {
            val buffer = Flux.from<DataBuffer>(body)
            return super.writeWith(buffer.doOnNext { bufferToProcess: DataBuffer ->
                capture(
                    bufferToProcess
                )
            })
        }

        private fun capture(buffer: DataBuffer) {
            body.append(StandardCharsets.UTF_8.decode(buffer.asByteBuffer()).toString())
        }

        val fullBody: String
            get() = body.toString()
    }

    private fun checkIfAccessControlIsInTire(apisCSV: String, toCheckApiPath: String): Boolean {
        if (apisCSV.isEmpty()) {
            return false
        }
        apisCSV.split(",").find { toFind ->
            getAccessControlPath(toFind).contains(toCheckApiPath)
        }?.let { _ ->
            return true
        } ?: run {
            return false
        }
    }

    private fun getAccessControlPath(name: String): String {
        val databaseAccessLogId = UUID.randomUUID().toString()
        print("name:$name")
        return if (redisObjectMaster.checkIfPresentAccessControlPath(name)) {
            redisObjectMaster.getAccessControlPath(name)
        } else {
            val accessControls =
                accessControlRepoAggregatorContract.findByNameAndDataStatus(name)
            if (accessControls.data.isEmpty()) {
                throw BadRequestException("Can not find a access control")
            }
            redisObjectMaster.saveAccessControlPath(name, accessControls.data[0].method)
            accessControls.data[0].method
        }
    }
}