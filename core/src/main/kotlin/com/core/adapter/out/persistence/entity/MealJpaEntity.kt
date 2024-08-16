package com.core.adapter.out.persistence.entity

import com.core.adapter.out.persistence.enumerate.MealStatus
import com.core.adapter.out.persistence.enumerate.MealType
import jakarta.persistence.*
import org.hibernate.annotations.Comment
import java.math.BigDecimal

@Entity
@Table(
    name = "meal",
    indexes = [Index(name = "meal_name_index", columnList = "name")]

)
class MealJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var idx: Long = 0

    @Column(name = "type", length = 20)
    @Enumerated(EnumType.STRING)
    var type: MealType? = null

    @Column(name = "status", length = 20)
    @Enumerated(EnumType.STRING)
    var status: MealStatus? = null

    @Comment("식사 가격")
    @Column(name = "price")
    var price: BigDecimal = BigDecimal.ZERO

    @ManyToOne
    @JoinColumn(name = "meal_id")
    var restaurant: Restaurant? = null


}