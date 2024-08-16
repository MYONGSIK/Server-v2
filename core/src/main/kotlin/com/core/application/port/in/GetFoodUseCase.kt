package com.core.application.port.`in`

import com.core.application.port.`in`.dto.GetFoodDto

interface GetFoodUseCase {

    fun execute(getFoodQuery: GetFoodQuery): GetFoodDto

    data class GetFoodQuery(
        val name: String
    )
}