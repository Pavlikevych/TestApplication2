package com.example.testapplication.local.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.testapplication.local.model.Product
import kotlinx.coroutines.flow.Flow

@Dao
abstract class ProductDao : BaseDao<Product>(Product::class.java) {

    @Query("SELECT * FROM all_product")
    abstract fun observe(): Flow<List<Product>>

    @Query("SELECT id FROM all_product WHERE product_type LIKE :productType")
    abstract suspend fun observeByProductType(productType: String): Flow<List<Product>>

    @Query("DELETE FROM all_product")
    abstract suspend fun deleteAll()
}