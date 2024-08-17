package com.core.adapter.`in`.web.dto

import com.core.application.port.`in`.dto.ApplicationMealDto

class AdapterMealDto {

    data class GetMealRes(
        val idx: Long,
        val type: String,
        val status: String,
        val meals: String
    ) {
        companion object {
            fun toResponse(data: List<ApplicationMealDto.GetMealRes>) : List<GetMealRes>{
                return data.map {
                    GetMealRes(
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