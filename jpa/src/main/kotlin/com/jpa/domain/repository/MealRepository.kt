package com.jpa.domain.repository

import com.jpa.domain.entity.MealJpaEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.time.LocalDate

@Repository
interface MealRepository: JpaRepository<MealJpaEntity, Long> {

    @Query("""
        SELECT m 
        FROM MealJpaEntity m 
        WHERE m.isDeleted = false and m.offeredAt between :start and :end and m.restaurantJpaEntity.idx = :restaurantIdx
    """)
    fun getWeekMeal(restaurantIdx: Long, start: LocalDate, end: LocalDate): List<MealJpaEntity>
}