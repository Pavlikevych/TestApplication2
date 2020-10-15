package com.example.testapplication.local.model

import androidx.room.ColumnInfo

data class Option (
    @ColumnInfo(name = "id")
    val id: Int = 0,

    @ColumnInfo(name = "product_id")
    val productId: Int = 0,

    @ColumnInfo(name = "name")
    val name: String = "",

    @ColumnInfo(name = "position")
    val position: Int = 0,

    @ColumnInfo(name = "values")
    val values: List<String> = emptyList()
){
    companion object {
        val Null = Option()
    }
}