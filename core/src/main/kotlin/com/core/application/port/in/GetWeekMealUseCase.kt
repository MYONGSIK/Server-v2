package com.core.application.port.`in`

import com.jpa.domain.model.Meal


interface GetWeekMealUseCase {

    operator fun invoke(restaurantIdx: Long): List<Meal>
}