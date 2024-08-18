package com.core.adapter.out.persistence.entity

import com.core.common.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "restaurant", indexes = [
    Index(name = "restaurant_idx_name", columnList = "name"),
])
class RestaurantJpaEntity : BaseEntity(){

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idx: Long = 0

    @Column(name = "name")
    val name: String = "DEFAULT"

    @Column(name = "address")
    val address: String = "DEFAULT"

    @Column(name = "is_deleted")
    val isDeleted: Boolean = false

    @ManyToOne
    @JoinColumn(name = "campus_id")
    val campusJpaEntity: CampusJpaEntity = CampusJpaEntity()

}