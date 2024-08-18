package com.jpa.domain.entity

import jakarta.persistence.*

@Entity
@Table(name = "users")
class UserJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idx: Long = 0

    @Column(name = "phone_id")
    val phoneId: String = "DEFAULT"
}