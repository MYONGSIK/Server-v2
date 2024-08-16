package com.core.adapter.out.persistence.entity

import jakarta.persistence.*

@Entity
@Table(name = "restaurant", indexes = [
    Index(name = "idx_name", columnList = "name"),
])
class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idx: Long? = null

    @Column(name = "name")
    val name: String? = null

    @Column(name = "address")
    val address: String? = null

    @ManyToOne
    @JoinColumn(name = "category_id")
    val university: University? = null


}