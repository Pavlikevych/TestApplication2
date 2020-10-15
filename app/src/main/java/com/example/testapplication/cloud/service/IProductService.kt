package com.example.testapplication.cloud.service

import com.example.testapplication.cloud.model.ProductsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface IProductService {

    @GET("/admin/products.json")
    suspend fun getProducts(
        @Query("page") page: Int,
        @Query("access_token") access_token: String = "c32313df0d0ef512ca64d5b336a0d7c6"
    ): ProductsResponse = throw NotImplementedError()
}