package com.core.application.port.out

import com.core.application.domain.meal.model.Meal
import java.time.LocalDate

interface GetWeekMealPort {

    operator fun invoke(restaurantIdx: Long,
                        start: LocalDate,
                        end: LocalDate): List<Meal>
}