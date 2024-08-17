package com.core.application.port.`in`

import com.core.application.domain.meal.model.Meal

interface GetWeekMealUseCase {

    operator fun invoke(campusName: String): List<Meal>
}