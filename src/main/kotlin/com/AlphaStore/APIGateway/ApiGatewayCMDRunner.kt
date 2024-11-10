package com.AlphaStore.APIGateway

import com.AlphaStore.APIGateway.seeder.SeederMaster
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Configuration

@Configuration
class ApiGatewayCMDRunner(
    private val seederMaster: SeederMaster,
) : CommandLineRunner {

    override fun run(vararg args: String?) {
        seederMaster.seed()
    }
}