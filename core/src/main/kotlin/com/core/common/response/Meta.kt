package com.core.common.response

data class Meta(
    val result: String,
    val errorCode: String,
    val message: String
){
    constructor() : this(
        result = "",
        errorCode = "",
        message = ""
    )

    fun ok(): Meta {
        return Meta(
            result = "SUCCESS",
            errorCode = "",
            message = ""
        )
    }

    fun error(error: Error): Meta = Meta(
        result = "ERROR",
        errorCode = error.code,
        message = error.message
    )
}
