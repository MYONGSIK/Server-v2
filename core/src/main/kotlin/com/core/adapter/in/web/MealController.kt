package com.core.adapter.`in`.web

import com.core.adapter.`in`.web.dto.AdapterMealDto
import com.core.application.port.`in`.GetWeekMealUseCase
import com.core.common.response.ApplicationResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MealController(val getWeekMealUseCase: GetWeekMealUseCase) {

    @GetMapping("/api/v1/meals/week")
    fun getWeekMeal(
        @RequestParam("restaurantName") restaurantName: String
    ) : ApplicationResponse<List<AdapterMealDto.GetWeekMealRes>> {
        val data = getWeekMealUseCase(restaurantName)
        val toResponse = AdapterMealDto.GetWeekMealRes.from(data)
        return ApplicationResponse.ok(toResponse)
    }

}
