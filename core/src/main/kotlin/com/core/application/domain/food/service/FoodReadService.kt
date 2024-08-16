package com.core.application.domain.food.service

import com.core.application.port.`in`.GetFoodUseCase
import com.core.application.port.`in`.dto.GetFoodDto

class FoodReadService : GetFoodUseCase {
    override fun execute(getFoodQuery: GetFoodUseCase.GetFoodQuery): GetFoodDto {
        TODO("Not yet implemented")
    }


}