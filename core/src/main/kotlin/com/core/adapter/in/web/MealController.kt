package com.core.adapter.`in`.web

import com.core.adapter.`in`.web.dto.AdapterMealDto
import com.core.application.port.`in`.GetWeekMealUseCase
import com.core.common.response.ApplicationResponse
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@Tag(name = "식단 조회 API", description = "식단 조회 API")
@RestController
class MealController(val getWeekMealUseCase: GetWeekMealUseCase) {


    @GetMapping("/api/v1/meals/week")
    @Operation(summary = "주간 식단 조회", description = "주간 식단 조회 API입니다.")
    fun getWeekMeal(
        @Schema(description = "식당 인덱스", example = "1")
        @RequestParam("restaurantIdx")
        restaurantIdx: Long
    ) : ApplicationResponse<List<AdapterMealDto.GroupedWeekMealRes>> {
        val data = getWeekMealUseCase(restaurantIdx)
        val toResponse = AdapterMealDto.GetWeekMealRes.from(data)
        return ApplicationResponse.ok(toResponse)
    }

}
