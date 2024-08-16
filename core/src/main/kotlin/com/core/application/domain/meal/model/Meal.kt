package com.core.application.domain.meal.model

import jakarta.annotation.Generated
import jakarta.persistence.*


data class Meal(
    val idx: Long,
    val type: String,
    val status: String,
    val meals: String
) {



}