package com.core.adapter.out.persistence.entity

import jakarta.persistence.*

@Entity
@Table(name = "restaurant", indexes = [
    Index(name = "idx_name", columnList = "name"),
])
class RestaurantJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idx: Long = 0

    @Column(name = "name")
    val name: String = "DEFAULT"

    @Column(name = "address")
    val address: String = "DEFAULT"

    @ManyToOne
    @JoinColumn(name = "category_id")
    val universityJpaEntity: UniversityJpaEntity? = null


}