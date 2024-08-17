package com.core.application.port.`in`

import com.core.application.port.`in`.dto.ApplicationMealDto

interface GetMealUseCase {

    fun execute(): List<ApplicationMealDto.GetMealRes>

}