package com.example.testapplication.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "all_product_type")
data class ProductType(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int = 0,

    @ColumnInfo(name = "product_type_name")
    val productType: String = ""
) {
    companion object {
        val Null = ProductType()
    }
}