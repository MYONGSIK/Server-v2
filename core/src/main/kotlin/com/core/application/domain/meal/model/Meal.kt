package com.core.application.domain.meal.model

import com.core.adapter.out.persistence.enumerate.MealStatus
import com.core.adapter.out.persistence.enumerate.MealType
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime


data class Meal(
    var idx: Long = 0,
    var meals: String = "제공된 학식 정보가 없습니다.",
    var type: MealType = MealType.LUNCH,
    var status: MealStatus = MealStatus.OPEN,
    var price: BigDecimal = BigDecimal.ZERO,
    var offeredAt: LocalDate = LocalDate.now(),
    val isDeleted: Boolean = false,
    var restaurantName: String = "DEFAULT",
    val updatedAt: LocalDateTime = LocalDateTime.now(),
    val createdAt: LocalDateTime = LocalDateTime.now(),
) {



}