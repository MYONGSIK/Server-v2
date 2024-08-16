package com.core.application.port.`in`.dto

data class RegisteMealCommand(
    val name: String,
    val price: Int,
    val description: String
)
