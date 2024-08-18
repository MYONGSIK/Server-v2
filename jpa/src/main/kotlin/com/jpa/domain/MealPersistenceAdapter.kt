package com.jpa.domain

import com.jpa.domain.mapper.MealMapper
import com.jpa.domain.repository.MealRepository
import com.jpa.domain.model.Meal
import org.springframework.stereotype.Component
import java.time.LocalDate

@Component
class MealPersistenceAdapter(
    private val mealRepository: MealRepository,
    private val mealMapper: MealMapper
)  {
   fun getWeekMeals(restaurantIdx: Long, start: LocalDate, end: LocalDate): List<Meal> {
       val weekMeal = mealRepository.getWeekMeal(restaurantIdx, start, end)
       val applicationMeals = mealMapper.toDomain(weekMeal);
       return applicationMeals
   }
}