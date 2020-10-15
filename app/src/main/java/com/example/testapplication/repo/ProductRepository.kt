package com.example.testapplication.repo

import androidx.lifecycle.MutableLiveData
import com.example.testapplication.cloud.CloudApi
import com.example.testapplication.cloud.model.ProductsResponse
import com.example.testapplication.local.AppDatabase
import com.example.testapplication.local.model.Product
import com.example.testapplication.local.model.ProductType
import com.example.testapplication.utils.extensions.loge

class ProductRepository(private val database: AppDatabase, private val cloud: CloudApi) {

    val failureLiveData = MutableLiveData<Boolean>()

    suspend fun getAllProduct() {
        val productResponse = cloud.product.getProducts(1).productAPIS ?: emptyList()

        val productsType = productResponse.map { it.productType.orEmpty() }.distinct()
        val list = productsType.map { ProductType(productType = it) }
    }

    private suspend fun getAllProductSafety() : ProductsResponse {
        try {
            return cloud.product.getProducts(page = 1)
        } catch (e: Exception) {
            loge(e.message.orEmpty())
            failureLiveData.postValue(true)
        }
        return ProductsResponse()
    }

    private suspend fun insert(data: List<Product>) {
        try {
            database.productDao.insert(data)
        } catch (e: Exception) {
            loge("failed to insert")
        }
    }

    private suspend fun insertProductType(data: List<ProductType>) {
        try {
            database.productTypeDao.insert(data)
        } catch (e: Exception) {
            loge("failed to insert")
        }
    }
}