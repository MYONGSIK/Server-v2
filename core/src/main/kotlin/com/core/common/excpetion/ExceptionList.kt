package com.core.common.excpetion

import org.springframework.http.HttpStatus

enum class ExceptionList(
    val code: String,
    val status: HttpStatus,
    val message: String
) {
    SERVER_ERROR("SE0001",HttpStatus.INTERNAL_SERVER_ERROR, "서버 에러가 발생하였습니다")

}