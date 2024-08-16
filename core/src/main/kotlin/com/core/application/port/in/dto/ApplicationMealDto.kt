package com.core.application.port.`in`.dto

data class ApplicationMealDto (
    val name: String,
    val price: Int,
    val description: String
) {
    data class GetFoodRes(
        val idx: Long,
        val type: String,
        val status: String,
        val meals: String
    ) {
    }
}