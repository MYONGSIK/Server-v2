package com.core.adapter.out.persistence.entity

import jakarta.persistence.*
import org.hibernate.annotations.Comment

@Entity
@Table(name = "store", indexes = [
    Index(name = "store_idx_name", columnList = "name"),
    Index(name = "store_idx_category_group", columnList = "category_group"),
    Index(name = "store_idx_category", columnList = "category"),
])
class StoreJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idx: Long = 0

    @Column(name = "name")
    val name: String = "DEFAULT"

    @Column(name = "address")
    val address: String = "DEFAULT"

    @Comment("카카오에서 제공하는 카테고리")
    @Column(name = "category_group")
    val categoryGroup: String = "DEFAULT"

    @Comment("조회할때 쓰인 음식점, 카페에 대한 카테고리")
    @Column(name = "category")
    val category: String = "DEFAULT"

    @Comment("조회할때 쓰인 음식점, 카페에 대한 세분화된 카테고리")
    @Column(name = "category_detail")
    val categoryDetail: String = "DEFAULT"

    @Comment("카카오에서 제공하는 ID")
    val kakaoId: String = "DEFAULT"

    @Column(name = "phone")
    val phone: String = "DEFAULT"

    @Column(name = "distance")
    val distance: Int = 0

    @Column(name = "url")
    val url: String = "DEFAULT"

    @Column(name = "road_address")
    val roadAddress: String = "DEFAULT"

    @Column(name = "x")
    val x: String = "DEFAULT"

    @Column(name = "y")
    val y: String = "DEFAULT"

    @Column(name = "is_deleted")
    val isDeleted: Boolean = false

    @ManyToOne(fetch = FetchType.LAZY)
    val university: CampusJpaEntity = CampusJpaEntity()
}