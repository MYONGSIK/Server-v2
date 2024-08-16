package com.core.adapter.`in`.web.dto

import com.core.application.port.`in`.dto.ApplicationMealDto
import java.time.LocalDateTime

class AdapterMealDto {

    data class GetFoodRes(
        val idx: Long,
        val type: String,
        val status: String,
        val meals: String
    ) {
        companion object {
            fun toResponse(data: List<ApplicationMealDto.GetFoodRes>) : List<GetFoodRes>{
                return data.map {
                    GetFoodRes(
                        idx = it.idx,
                        type = it.type,
                        status = it.status,
                        meals = it.meals
                    )
                }
            }
        }
    }

}