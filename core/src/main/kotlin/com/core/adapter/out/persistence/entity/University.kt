package com.core.adapter.out.persistence.entity

import jakarta.persistence.*
import jakarta.persistence.criteria.CriteriaBuilder.In

@Entity
@Table(name = "university", indexes = [
    Index(name = "idx_name", columnList = "name"),
])
class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idx: Long? = null

    @Column(name = "name")
    val name: String? = null

    @Column(name = "campus_name")
    val campusName: String? = null

    @Column(name = "is_deleted")
    val isDeleted: Boolean? = null
}