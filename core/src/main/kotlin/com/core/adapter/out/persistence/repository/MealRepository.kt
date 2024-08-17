package com.core.adapter.out.persistence.repository

import com.core.adapter.out.persistence.entity.MealJpaEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.time.LocalDate
import java.time.LocalDateTime

@Repository
interface MealRepository: JpaRepository<MealJpaEntity, Long> {

    @Query("""
        SELECT m 
        FROM MealJpaEntity m 
            left join RestaurantJpaEntity r on r.name = :restaurantName
        WHERE m.isDeleted = false and m.offeredAt between :start and :end
    """)
    fun getWeekMeal(restaurantName: String, start: LocalDate, end: LocalDate): List<MealJpaEntity>
}