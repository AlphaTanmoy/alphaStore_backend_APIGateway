package com.AlphaStore.APIGateway

import org.springdoc.core.models.GroupedOpenApi
import org.springdoc.core.properties.SwaggerUiConfigParameters
import org.springframework.cloud.gateway.route.RouteDefinitionLocator
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class OpenApiConfiguration {

    @Bean
    fun apis(
        swaggerUiConfigParameters: SwaggerUiConfigParameters,
        locator: RouteDefinitionLocator
    ): List<GroupedOpenApi> {
        val groups: List<GroupedOpenApi> = ArrayList()
        val definitions = locator.routeDefinitions.collectList().block()!!
        definitions.stream().forEach {
            if (!it.id.contains("apigateway", ignoreCase = true)) {
                val name: String = it.id.replace("ReactiveCompositeDiscoveryClient_", "").lowercase()
                swaggerUiConfigParameters.addGroup(name)
                GroupedOpenApi.builder()
                    .pathsToMatch("/$name/**")
                    .group(name)
                    .build()
            }
        }
        return groups
    }
}