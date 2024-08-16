package com.core.adapter.`in`.web

import com.core.adapter.`in`.web.dto.AdapterMealDto
import com.core.application.port.`in`.GetMealUseCase
import com.core.application.port.`in`.dto.ApplicationMealDto
import com.core.common.response.ApplicationResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController("/api/v1/foods")
class MealController(private val getMealUseCase: GetMealUseCase) {

    @GetMapping
    fun getFood() : ApplicationResponse<List<AdapterMealDto.GetFoodRes>> {
        val data = getMealUseCase.execute()
        val toResponse = AdapterMealDto.GetFoodRes.toResponse(data)
        return ApplicationResponse.ok(toResponse)
    }

}