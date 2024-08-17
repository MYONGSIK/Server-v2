package com.core.application.domain.meal.model

import java.time.LocalDateTime

data class Campus(
    val idx: Long = 0,
    val name: String = "DEFAULT",
    val address: String = "DEFAULT",
    val isDeleted: Boolean = false,
    val updatedDate: LocalDateTime = LocalDateTime.now(),
    val createdDate: LocalDateTime = LocalDateTime.now(),
) {
}