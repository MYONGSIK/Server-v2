package com.core.application.domain.meal.service

import com.core.application.port.`in`.GetMealUseCase
import com.core.application.port.`in`.dto.ApplicationMealDto
import org.springframework.stereotype.Service

@Service
class MealReadService : GetMealUseCase {

    override fun execute(): List<ApplicationMealDto.GetMealRes> {
        TODO("Not yet implemented")
    }


}