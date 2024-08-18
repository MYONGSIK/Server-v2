package com.jpa.domain.mapper

import com.jpa.domain.entity.MealJpaEntity
import com.jpa.domain.enumerate.MealStatus
import com.jpa.domain.enumerate.MealType
import com.jpa.domain.model.Meal
import org.springframework.stereotype.Component
import java.math.BigDecimal
import java.time.LocalDateTime

@Component
data class MealMapper(
    var idx: Long = 0,
    var meals: String = "",
    var type: MealType = MealType.LUNCH,
    var status: MealStatus = MealStatus.OPEN,
    var price: BigDecimal = BigDecimal.ZERO,
    var offeredAt: LocalDateTime = LocalDateTime.now(),
    val isDeleted: Boolean = false,
    val updatedAt: LocalDateTime = LocalDateTime.now(),
    val createdAt: LocalDateTime = LocalDateTime.now(),
    var restaurantName: String = "DEFAULT",
) {
    fun toDomain(mealJpaEntities: List<MealJpaEntity>): List<Meal> {
        return mealJpaEntities.map {
            Meal(
                idx = it.idx,
                meals = it.meals,
                type = it.type,
                status = it.status,
                price = it.price,
                offeredAt = it.offeredAt,
                isDeleted = it.isDeleted,
                restaurantName = it.restaurantJpaEntity.name,
                updatedAt = it.updatedAt,
                createdAt = it.createdAt,
            )
        }
    }
}