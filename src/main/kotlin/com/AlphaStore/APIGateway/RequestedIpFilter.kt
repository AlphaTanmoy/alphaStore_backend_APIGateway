package com.AlphaStore.APIGateway

import com.alphaStore.Core.contracts.IPResolverContract
import com.alphaStore.Utils.KeywordsAndConstants
import org.springframework.cloud.gateway.filter.GatewayFilter
import org.springframework.cloud.gateway.filter.GatewayFilterChain
import org.springframework.web.server.ServerWebExchange
import reactor.core.publisher.Mono

class RequestedIpFilter(
    private val ipResolverContract: IPResolverContract
) : GatewayFilter {
    override fun filter(exchange: ServerWebExchange, chain: GatewayFilterChain): Mono<Void> {
        val ip = ipResolverContract.resolve(exchange)
        return chain.filter(
            exchange
                .mutate()
                .request(
                    exchange
                        .request
                        .mutate()
                        .header(
                            KeywordsAndConstants.HEADER_REQUESTING_IP,
                            ip
                        )
                        .build()
                )
                .build()
        )
    }
}