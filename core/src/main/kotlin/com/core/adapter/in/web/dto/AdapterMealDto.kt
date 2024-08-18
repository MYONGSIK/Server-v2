package com.core.adapter.`in`.web.dto

import com.jpa.domain.model.Meal
import java.math.BigDecimal
import java.time.LocalDate

class AdapterMealDto {
    data class GroupedWeekMealRes(
        val offeredAt: LocalDate,
        val getWeekMealRes: List<GetWeekMealRes>
    )

    data class GetWeekMealRes(
        val idx: Long,
        val type: String,
        val status: String,
        val offeredAt: LocalDate,
        val price: BigDecimal,
        val meals: List<String>
    ) {
        companion object {
            fun from(data: List<Meal>): List<GroupedWeekMealRes> {
                val groupedData = data.map {
                    GetWeekMealRes(
                        idx = it.idx,
                        type = it.type.value,
                        status = it.status.value,
                        offeredAt = it.offeredAt,
                        price = it.price,
                        meals = it.meals.split(",").map { meal -> meal.trim() }
                    )
                }.groupBy { it.offeredAt }
                return groupedData.map { (date, meals) ->
                    GroupedWeekMealRes(
                        offeredAt = date,
                        getWeekMealRes = meals
                    )
                }
            }
        }
    }
}