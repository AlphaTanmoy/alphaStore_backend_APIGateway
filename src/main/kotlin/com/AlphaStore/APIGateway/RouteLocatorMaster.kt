package com.AlphaStore.APIGateway

import com.alphaStore.Core.contracts.IPResolverContract
import com.alphaStore.Utils.jwtUtilMaster.JwtUtilMaster
import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class RouteLocatorMaster(
    private val jwtUtilMaster: JwtUtilMaster,
    private val ipResolverContract: IPResolverContract,
) {

    @Bean
    fun routeLocator(builder: RouteLocatorBuilder): RouteLocator {
        return builder.routes()
            .route { route ->
                route
                    .path(
                        "/**",
                    )
                    .filters { f ->
                        f
                            .filter(AuthenticationFilter())
                            .filter(RequestedIpFilter(ipResolverContract))
                            .filter(
                                ApiAccessLoggerFilter(
                                    jwtUtilMaster,
                                    genericLogsMaster = TODO(),
                                    redisObjectMaster = TODO(),
                                    accessControlRepoAggregatorContract = TODO(),
                                    accessControlService = TODO(),
                                )
                            )
                            .filter(RetryFilter())
                    }
                    .uri("lb://core")
            }
            .build()
    }
}