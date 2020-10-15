package com.example.testapplication.repo

import androidx.lifecycle.MutableLiveData
import com.example.testapplication.cloud.CloudApi
import com.example.testapplication.cloud.model.ProductsResponse
import com.example.testapplication.local.AppDatabase
import com.example.testapplication.local.model.*
import com.example.testapplication.utils.extensions.loge
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow

class ProductRepository(private val database: AppDatabase, private val cloud: CloudApi) {

    val failureLiveData = MutableLiveData<Boolean>()

    suspend fun getAllProduct() {
        val productResponse = getAllProductSafety(1).productAPIS ?: emptyList()

        val productsType = productResponse.map { it.productType.orEmpty() }.distinct()
        val list = productsType.mapIndexed { index, type ->
            ProductType(id = index, productType = type)
        }
        insertProductType(list)

        val products = productResponse.map {
            val variants = it.variantAPIS
                ?.filter { variantAPI -> variantAPI.requiresShipping == true }
                ?.map { variant ->
                    Variant(
                        id = variant.id ?: 0,
                        title = variant.title.orEmpty(),
                        price = variant.price.orEmpty()
                    )
                }
            Product(
                id = it.id ?: 0,
                title = it.title.orEmpty(),
                productType = it.productType.orEmpty(),
                variants = variants ?: emptyList(),
                image = Images(src = it.image?.src.orEmpty())
            )
        }
        insert(products)
        failureLiveData.postValue(false)
    }

    private suspend fun getAllProductSafety(page: Int): ProductsResponse {
        try {
            return cloud.product.getProducts(page)
        } catch (e: Exception) {
            loge(e.message.orEmpty())
            failureLiveData.postValue(true)
        }
        return ProductsResponse()
    }

    fun observeProductsType(): Flow<List<ProductType>> {
        try {
            return database.productTypeDao.observeProductType()
        } catch (e: Exception) {
            loge("failed to observe")
        }
        return emptyFlow()
    }

    fun observeProductsByType(type: String): Flow<List<Product>> {
        try {
            return database.productDao.observeByProductType(type)
        } catch (e: Exception) {
            loge("failed to observe")
        }
        return emptyFlow()
    }

    private suspend fun insert(data: List<Product>) {
        try {
            database.productDao.insert(data)
        } catch (e: Exception) {
            loge("failed to insert")
            failureLiveData.postValue(true)
        }
    }

    private suspend fun insertProductType(data: List<ProductType>) {
        try {
            database.productTypeDao.insert(data)
        } catch (e: Exception) {
            loge("failed to insert")
            failureLiveData.postValue(true)
        }
    }
}