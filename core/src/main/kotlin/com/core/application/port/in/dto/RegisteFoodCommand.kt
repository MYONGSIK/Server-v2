package com.core.application.port.`in`.dto

data class RegisteFoodCommand(
    val name: String,
    val price: Int,
    val description: String
)
