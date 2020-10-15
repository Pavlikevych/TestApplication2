package com.example.testapplication.cloud.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName

class OptionAPI {
    @SerializedName("id")
    @Expose
    var id: Long? = null
        private set

    @SerializedName("product_id")
    @Expose
    var productId: Long? = null
        private set

    @SerializedName("name")
    @Expose
    var name: String? = null
        private set

    @SerializedName("position")
    @Expose
    var position: Int? = null
        private set

    @SerializedName("values")
    @Expose
    var values: List<String>? = null
        private set
}