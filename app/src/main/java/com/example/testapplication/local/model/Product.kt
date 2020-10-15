package com.example.testapplication.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "all_product")
data class Product(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Long = 1,

    @ColumnInfo(name = "title")
    val title: String = "",

    @ColumnInfo(name = "body_html")
    val bodyHtml: String = "",

    @ColumnInfo(name = "vendor")
    val vendor: String = "",

    @ColumnInfo(name = "product_type")
    val productType: String = "",

    @ColumnInfo(name = "created_at")
    val createdAt: String = "",

    @ColumnInfo(name = "handle")
    val handle: String = "",

    @ColumnInfo(name = "updated_at")
    val updatedAt: String = "",

    @ColumnInfo(name = "published_at")
    val publishedAt: String = "",

    @ColumnInfo(name = "template_suffix")
    val templateSuffix: String = "",

    @ColumnInfo(name = "published_scope")
    val publishedScope: String = "",

    @ColumnInfo(name = "tags")
    val tags: String = "",

    @ColumnInfo(name = "admin_graphql_api_id")
    val adminGraphqlApiId: String = "",

    @ColumnInfo(name = "variants")
    val variants: List<Variant> = emptyList(),

    @ColumnInfo(name = "options")
    val options: List<Option> = emptyList(),

    @ColumnInfo(name = "images")
    val images: List<Image> = emptyList(),

    @ColumnInfo(name = "image")
    val image: Images = Images()
){
    companion object {
        val Null = Product()
    }
}