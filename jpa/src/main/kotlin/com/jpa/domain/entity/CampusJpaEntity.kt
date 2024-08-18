package com.jpa.domain.entity

import com.jpa.domain.common.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "campus", indexes = [
    Index(name = "campus_idx_name", columnList = "name"),
])
class CampusJpaEntity : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idx: Long = 0

    @Column(name = "name")
    val name: String = "DEFAULT"

    @Column(name = "address")
    val address: String = "DEFAULT"

    @Column(name = "is_deleted")
    val isDeleted: Boolean = false
}