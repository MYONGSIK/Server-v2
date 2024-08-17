package com.core.common.response

import com.core.common.excpetion.ExceptionList

data class ApplicationResponse<T>(
    val meta: Meta,
    val data: T?,
    val error: Error?
){
    companion object {
        fun <T> ok(data: T): ApplicationResponse<T> = ApplicationResponse(
            meta = Meta().ok(),
            data = data,
            error = null
        )

        fun <T> error(error: ExceptionList): ApplicationResponse<T> = ApplicationResponse(
            meta = Meta().error(error.code, error.message),
            data = null,
            error = Error(error.code, error.message)
        )
    }

}
