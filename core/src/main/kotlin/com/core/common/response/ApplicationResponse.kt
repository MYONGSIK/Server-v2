package com.core.common.response

data class ApplicationResponse<T>(
    val meta: Meta,
    val data: T,
    val error: Error?
){
    companion object {
        fun <T> ok(data: T): ApplicationResponse<T> = ApplicationResponse(
            meta = Meta().ok(),
            data = data,
            error = null
        )
    }

}
