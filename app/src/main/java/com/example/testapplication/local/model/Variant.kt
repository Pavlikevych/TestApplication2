package com.example.testapplication.local.model

import androidx.room.ColumnInfo

data class Variant(
    @ColumnInfo(name = "id")
    val id: Int = 0,

    @ColumnInfo(name = "product_id")
    val productId: Int = 0,

    @ColumnInfo(name = "title")
    val title: String = "",

    @ColumnInfo(name = "price")
    val price: String = "",

    @ColumnInfo(name = "sku")
    val sku: String = "",

    @ColumnInfo(name = "position")
    val position: Int = 0,

    @ColumnInfo(name = "inventory_policy")
    val inventoryPolicy: String = "",

    @ColumnInfo(name = "compare_at_price")
    val compareAtPrice: String = "",

    @ColumnInfo(name = "fulfillment_service")
    val fulfillmentService: String = "",

    @ColumnInfo(name = "inventory_management")
    val inventoryManagement: String = "",

    @ColumnInfo(name = "option1")
    val option1: String = "",

    @ColumnInfo(name = "option2")
    val option2: String = "",

    @ColumnInfo(name = "option3")
    val option3: String = "",

    @ColumnInfo(name = "created_at")
    val createdAt: String = "",

    @ColumnInfo(name = "updated_at")
    val updatedAt: String = "",

    @ColumnInfo(name = "taxable")
    val taxable: Boolean = false,

    @ColumnInfo(name = "barcode")
    val barcode: String = "",

    @ColumnInfo(name = "grams")
    val grams: Int = 0,

    @ColumnInfo(name = "image_id")
    val imageId: String = "",

    @ColumnInfo(name = "weight")
    val weight: Double = 0.0,

    @ColumnInfo(name = "weight_unit")
    val weightUnit: String = "",

    @ColumnInfo(name = "inventory_item_id")
    val inventoryItemId: Int = 0,

    @ColumnInfo(name = "inventory_quantity")
    val inventoryQuantity: Int = 0,

    @ColumnInfo(name = "old_inventory_quantity")
    val oldInventoryQuantity: Int = 0,

    @ColumnInfo(name = "requires_shipping")
    val requiresShipping: Boolean = false,

    @ColumnInfo(name = "admin_graphql_api_id")
    val adminGraphqlApiId: String = ""
) {
    companion object {
        val Null = Variant()
    }
}