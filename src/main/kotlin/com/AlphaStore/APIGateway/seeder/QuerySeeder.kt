package com.AlphaStore.APIGateway.seeder

import com.alphaStore.Core.repo.CountryRepo
import org.springframework.stereotype.Component

@Component
class QuerySeeder(
    private var countryRepo: CountryRepo,
) {
    fun seed() {
        countryRepo.createQueryExecutionStoredFunction()
    }
}