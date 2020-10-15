package com.example.testapplication.cloud

import com.example.testapplication.cloud.service.IProductService
import com.example.testapplication.cloud.service.ProductService
import com.example.testapplication.utils.Constants
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class CloudApi {

    val product: ProductService

    init {
        val gson = GsonBuilder()
            .setLenient()
            .create()

        val okHttp = OkHttpClient.Builder()
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .connectTimeout(30, TimeUnit.SECONDS)
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(okHttp)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()

        product = ProductService(retrofit.create(IProductService::class.java))
    }
}