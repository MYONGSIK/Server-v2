package com.core.adapter.`in`.web.dto

import com.core.application.domain.meal.model.Meal
import java.math.BigDecimal
import java.time.LocalDate

class AdapterMealDto {
    data class GetWeekMealRes(
        val idx: Long,
        val type: String,
        val status: String,
        val offeredAt: LocalDate,
        val price: BigDecimal,
        val meals: List<String>
    ) {
        companion object {
            fun from(data: List<Meal>): List<GetWeekMealRes> {
                return data.map {
                    GetWeekMealRes(
                        idx = it.idx,
                        type = it.type.value,
                        status = it.status.value,
                        offeredAt = it.offeredAt,
                        price = it.price,
                        meals = it.meals.split(",")
                    )
                }
            }
        }
    }

}