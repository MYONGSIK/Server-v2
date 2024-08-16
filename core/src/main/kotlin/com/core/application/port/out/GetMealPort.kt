package com.core.application.port.out

interface GetMealPort {

        fun getMeal(): List<MealDto>

        data class MealDto(
            val name: String,
            val price: Int,
            val description: String
        )
}