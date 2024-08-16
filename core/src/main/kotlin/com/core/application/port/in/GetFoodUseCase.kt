package com.core.application.port.`in`

import com.core.application.port.`in`.dto.GetFoodDto

interface GetFoodUseCase {

    fun execute(): GetFoodDto

    data class GetFoodQuery(
        val name: String
    )
}