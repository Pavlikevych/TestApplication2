package com.example.testapplication.local.model

import androidx.room.ColumnInfo

data class Images (
    @ColumnInfo(name = "id")
    val id: Int = 0,

    @ColumnInfo(name = "product_id")
    val productId: Int = 0,

    @ColumnInfo(name = "position")
    val position: Int = 0,

    @ColumnInfo(name = "created_at")
    val createdAt: String = "",

    @ColumnInfo(name = "updated_at")
    val updatedAt: String = "",

    @ColumnInfo(name = "alt")
    val alt: String = "",

    @ColumnInfo(name = "width")
    val width: Int = 0,

    @ColumnInfo(name = "height")
    val height: Int = 0,

    @ColumnInfo(name = "src")
    val src: String = "",

    @ColumnInfo(name = "variant_ids")
    val variantIds: List<Any> = emptyList(),

    @ColumnInfo(name = "admin_graphql_api_id")
    val adminGraphqlApiId: String = ""
) {
    companion object {
        val Null = Images()
    }
}