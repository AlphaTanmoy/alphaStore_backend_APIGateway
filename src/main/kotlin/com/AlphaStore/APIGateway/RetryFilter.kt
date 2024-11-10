package com.AlphaStore.APIGateway

import com.alphaStore.Utils.KeywordsAndConstants
import org.springframework.cloud.gateway.filter.GatewayFilter
import org.springframework.cloud.gateway.filter.GatewayFilterChain
import org.springframework.cloud.gateway.filter.factory.RetryGatewayFilterFactory
import org.springframework.http.HttpMethod
import org.springframework.http.HttpStatus
import org.springframework.web.server.ServerWebExchange
import reactor.core.publisher.Mono

class RetryFilter() : GatewayFilter {
    private val retryConfig: RetryGatewayFilterFactory.RetryConfig = RetryGatewayFilterFactory.RetryConfig()

    init {
        retryConfig.setRetries(KeywordsAndConstants.MAX_RETRY_FOR_FAILED_REQUEST)
        retryConfig.setStatuses(*HttpStatus.entries.filter { toFilter -> toFilter.is5xxServerError }.toTypedArray())
        retryConfig.setMethods(
            HttpMethod.GET,
            HttpMethod.POST,
            HttpMethod.DELETE,
            HttpMethod.PUT,
        )
    }

    override fun filter(exchange: ServerWebExchange, chain: GatewayFilterChain): Mono<Void> {
        return RetryGatewayFilterFactory().apply(retryConfig).filter(exchange, chain)
    }
}