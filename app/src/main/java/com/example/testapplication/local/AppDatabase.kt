package com.example.testapplication.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.testapplication.local.dao.ProductDao
import com.example.testapplication.local.dao.ProductTypeDao
import com.example.testapplication.local.model.Product
import com.example.testapplication.local.model.ProductType

@TypeConverters(DatabaseConverters::class)
@Database(entities = [ProductType::class, Product::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract val productTypeDao: ProductTypeDao
    abstract val productDao: ProductDao
}