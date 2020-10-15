package com.example.testapplication.local.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.testapplication.local.model.ProductType
import kotlinx.coroutines.flow.Flow

@Dao
abstract class ProductTypeDao: BaseDao<ProductType>(ProductType::class.java) {

    @Query("SELECT * FROM all_product_type ")
    abstract fun observeProductType(): Flow<List<ProductType>>
}