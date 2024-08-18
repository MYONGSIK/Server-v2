package com.jpa.domain.entity

import jakarta.persistence.*
import org.hibernate.annotations.Comment
import java.awt.Image

@Entity
@Table(name = "scarp")
class ScrapJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idx: Long = 0

    @Column(name = "store_id")
    val storeId: Long = 0

    @Column(name = "user_id")
    val userId: Long = 0

}