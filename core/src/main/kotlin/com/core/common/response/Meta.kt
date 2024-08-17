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

    fun error(errorCode: String, message: String): Meta = Meta(
        result = "FAIL",
        errorCode = errorCode,
        message = message
    )
}
