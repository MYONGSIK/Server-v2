package com.core.adapter.out.persistence.enumerate

enum class MealStatus(val value: String) {
    OPEN("운영중"),
    CLOSED("운영종료"),
    SHORT_OPEN("단축운영"),
    BREAK_TIME("브레이크타임")
}