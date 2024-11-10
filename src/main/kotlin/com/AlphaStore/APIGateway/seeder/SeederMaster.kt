package com.AlphaStore.APIGateway.seeder

import com.alphaStore.APIGateway.seeder.CountrySeeder
import org.slf4j.Logger
import org.springframework.stereotype.Component

@Component
class SeederMaster(
    private val logger: Logger,
    private val querySeeder: QuerySeeder,
    private val countrySeeder: CountrySeeder,
){

    fun seed() {
        seedCountries()
        querySeeder.seed()
        logger.info("Done Seeding ...")
    }

    private fun seedCountries() {
        logger.info("Init Seeding ...")
        logger.info("Going for country seeding")
        countrySeeder.mayInsertCountryData()
        logger.info("Done country seeding")
    }


}