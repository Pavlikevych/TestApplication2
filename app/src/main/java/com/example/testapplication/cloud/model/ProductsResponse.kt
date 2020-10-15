package com.example.testapplication.cloud.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ProductsResponse {
    @SerializedName("products")
    @Expose
    var productAPIS: List<ProductAPI>? = null
        private set
}