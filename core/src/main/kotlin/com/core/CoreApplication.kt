package com.core

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.core", "com.jpa"])
class CoreApplication
fun main(args: Array<String>) {
    runApplication<CoreApplication>(*args)
}