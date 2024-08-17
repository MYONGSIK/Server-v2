package com.core.adapter.out.persistence.entity

import com.core.adapter.out.persistence.enumerate.MealStatus
import com.core.adapter.out.persistence.enumerate.MealType
import com.core.common.BaseEntity
import jakarta.persistence.*
import org.hibernate.annotations.Comment
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime

@Entity
@Table(
    name = "meals",
    indexes = [Index(name = "meal_restaurant_idx", columnList = "restaurant_id")]
)
class MealJpaEntity : BaseEntity(){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var idx: Long = 0

    @Column(name = "meals")
    var meals: String = ""

    @Column(name = "type", length = 20)
    @Enumerated(EnumType.STRING)
    var type: MealType = MealType.LUNCH

    @Column(name = "status", length = 20)
    @Enumerated(EnumType.STRING)
    var status: MealStatus = MealStatus.OPEN

    @Column(name = "price")
    var price: BigDecimal = BigDecimal.ZERO

    @Column(name = "offered_at")
    var offeredAt: LocalDate = LocalDate.now()

    @Column(name = "is_deleted")
    val isDeleted: Boolean = false

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    var restaurantJpaEntity: RestaurantJpaEntity = RestaurantJpaEntity()


}