package com.example.testapplication.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "type")
data class ProductType(

    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int = 0,

    @ColumnInfo(name = "product_type")
    val productType: String = ""
) {
    companion object {
        val Null = ProductType()
    }
}