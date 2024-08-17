package com.core.adapter.out.persistence

import com.core.adapter.out.persistence.mapper.MealMapper
import com.core.adapter.out.persistence.repository.MealRepository
import com.core.application.domain.meal.model.Meal
import com.core.application.port.out.GetWeekMealPort
import org.springframework.stereotype.Component
import java.time.LocalDate

@Component
class MealPersistenceAdapter(
    private val mealRepository: MealRepository,
    private val mealMapper: MealMapper
) : GetWeekMealPort {
    override fun invoke(restaurantName: String, start: LocalDate, end: LocalDate): List<Meal> {
        val weekMeal = mealRepository.getWeekMeal(restaurantName, start, end)
        val applicationMeals = mealMapper.toDomain(weekMeal);
        return applicationMeals
    }
}