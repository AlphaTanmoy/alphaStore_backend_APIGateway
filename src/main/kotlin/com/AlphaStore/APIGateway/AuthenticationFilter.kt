package com.AlphaStore.APIGateway

import com.alphaStore.Utils.KeywordsAndConstants
import com.alphaStore.Utils.encryptionmaster.EncodingUtil
import org.reactivestreams.Publisher
import org.springframework.cloud.gateway.filter.GatewayFilter
import org.springframework.cloud.gateway.filter.GatewayFilterChain
import org.springframework.core.io.buffer.DataBuffer
import org.springframework.http.HttpHeaders
import org.springframework.http.server.reactive.ServerHttpRequest
import org.springframework.http.server.reactive.ServerHttpRequestDecorator
import org.springframework.http.server.reactive.ServerHttpResponse
import org.springframework.http.server.reactive.ServerHttpResponseDecorator
import org.springframework.web.server.ServerWebExchange
import org.springframework.web.server.ServerWebExchangeDecorator
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.nio.ByteBuffer
import java.nio.charset.StandardCharsets
import java.util.*

class AuthenticationFilter() 
    : GatewayFilter {
    override fun filter(exchange: ServerWebExchange, chain: GatewayFilterChain): Mono<Void> {
        val newId =
            exchange.request.headers.getFirst(KeywordsAndConstants.HEADER_TRACKING_ID) ?: UUID.randomUUID().toString()
        val authToken = exchange.request.headers[HttpHeaders.AUTHORIZATION]
        val basicAuthString = "${KeywordsAndConstants.MICRO_SERVICE_USER_NAME}:${KeywordsAndConstants.MICRO_SERVICE_USER_PASSWORD}"
        authToken?.let { authTokenPositive ->
            authTokenPositive.forEach { auth ->
                return chain.filter(
                    exchange
                        .mutate()
                        .request(
                            exchange
                                .request
                                .mutate()
                                .header(
                                    KeywordsAndConstants.HEADER_AUTH_TOKEN,
                                    auth
                                )
                                .header(
                                    HttpHeaders.AUTHORIZATION,
                                    "Basic ${EncodingUtil.encode(basicAuthString)}"
                                )
                                .header(
                                    KeywordsAndConstants.HEADER_APIS_ACCESS_LOG_ID,
                                    newId
                                )
                                .build()
                        )
                        .build()
                )
            }
        }

        println("Basic auth string : ${basicAuthString}")

        return chain.filter(
            exchange
                .mutate()
                .request(
                    exchange
                        .request
                        .mutate()
                        .header(
                            HttpHeaders.AUTHORIZATION,
                            "Basic ${EncodingUtil.encode(basicAuthString)}"
                        )
                        .header(
                            KeywordsAndConstants.HEADER_APIS_ACCESS_LOG_ID,
                            newId
                        )
                        .build()
                )
                .build()
        )
    }

    class BodyCaptureExchange(exchange: ServerWebExchange) : ServerWebExchangeDecorator(exchange) {
        private lateinit var bodyCaptureRequest: BodyCaptureRequest
        private lateinit var bodyCaptureResponse: BodyCaptureResponse

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
            return super.writeWith(buffer.doOnNext { buffer: DataBuffer ->
                capture(
                    buffer
                )
            })
        }

        private fun capture(buffer: DataBuffer) {
            val byteBuffer = ByteBuffer.allocate(buffer.readableByteCount())
            buffer.toByteBuffer(byteBuffer)
            body.append(StandardCharsets.UTF_8.decode(byteBuffer).toString())
        }

        val fullBody: String
            get() = body.toString()
    }

}