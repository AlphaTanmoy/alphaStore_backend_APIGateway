package com.AlphaStore.APIGateway

import org.springframework.http.HttpHeaders
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken

class JwtAuthenticationToken(
    val token: String = "",
    val httpMethod: String = "",
    val path: String = "",
    val httpHeaders: HttpHeaders,
    val trackingId: String
) : UsernamePasswordAuthenticationToken(null, null) {

    override fun getCredentials(): Any {
        return ""
    }

    override fun getPrincipal(): Any {
        return ""
    }
}