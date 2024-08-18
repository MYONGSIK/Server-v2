package com.core.application.domain.meal.service

import com.core.application.port.`in`.GetWeekMealUseCase
import com.jpa.domain.MealPersistenceAdapter
import com.jpa.domain.model.Meal
import org.springframework.stereotype.Service
import java.time.DayOfWeek
import java.time.LocalDate

@Service
class MealReadService(
    private val mealPersistenceAdapter: MealPersistenceAdapter
) : GetWeekMealUseCase {

    /**
     * 주간 식단 조회
     * @param restaurantName
     * @return List<ApplicationMealDto.GetWeekMealRes>
     */
    override operator fun invoke(restaurantIdx: Long): List<Meal> {
        val (startDay, endDay) = getWeekRange()
        val meals = mealPersistenceAdapter.getWeekMeals(restaurantIdx, startDay, endDay)
        return meals
    }

    /**
     * 주간 날짜 범위 조회
     * @return Pair<LocalDate, LocalDate>
     */
    fun getWeekRange(): Pair<LocalDate, LocalDate> {
        val today = LocalDate.now()
        val startOfWeek = today.minusDays((today.dayOfWeek.value % 7).toLong()).with(DayOfWeek.SUNDAY)
        val endOfWeek = startOfWeek.plusDays(6)
        return Pair(startOfWeek, endOfWeek)
    }


}