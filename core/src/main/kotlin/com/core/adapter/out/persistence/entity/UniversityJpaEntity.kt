package com.core.adapter.out.persistence.entity

import jakarta.persistence.*

@Entity
@Table(name = "university", indexes = [
    Index(name = "idx_name", columnList = "name"),
])
class UniversityJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idx: Long? = null

    @Column(name = "name")
    val name: String = "DEFAULT"

    @Column(name = "campus_name")
    val campusName: String = "DEFAULT"

    @Column(name = "is_deleted")
    val isDeleted: Boolean = true
}