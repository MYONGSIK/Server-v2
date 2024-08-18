package com.core.common.excpetion

import com.core.common.response.ApplicationResponse
import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import kotlin.math.log

private val logger = KotlinLogging.logger {}

@RestControllerAdvice
class ExceptionAdvice {

    @ExceptionHandler(Exception::class)
    fun handleException(e: Exception): ResponseEntity<ApplicationResponse<Error>> {
        logger.error {
            "error : ${e.message}"
            e.printStackTrace()
        }
        return ResponseEntity.status(ExceptionList.SERVER_ERROR.status)
            .body(ApplicationResponse.error(ExceptionList.SERVER_ERROR))
    }
}