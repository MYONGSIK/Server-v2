package com.core.adapter.`in`.web

import com.core.adapter.`in`.web.dto.AdapterMealDto
import com.core.application.port.`in`.GetMealUseCase
import com.core.common.response.ApplicationResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController("/api/v1/meals")
class MealController(private val getMealUseCase: GetMealUseCase) {

    @GetMapping
    fun getMeal() : ApplicationResponse<List<AdapterMealDto.GetMealRes>> {
        val data = getMealUseCase.execute()
        val toResponse = AdapterMealDto.GetMealRes.toResponse(data)
        return ApplicationResponse.ok(toResponse)
    }

}