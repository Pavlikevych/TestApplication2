package com.example.testapplication.cloud.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ImageAPI {
    @SerializedName("id")
    @Expose
    var id: Int? = null
        private set

    @SerializedName("product_id")
    @Expose
    var productId: Int? = null
        private set

    @SerializedName("position")
    @Expose
    var position: Int? = null
        private set

    @SerializedName("created_at")
    @Expose
    var createdAt: String? = null
        private set

    @SerializedName("updated_at")
    @Expose
    var updatedAt: String? = null
        private set

    @SerializedName("alt")
    @Expose
    var alt: Any? = null
        private set

    @SerializedName("width")
    @Expose
    var width: Int? = null
        private set

    @SerializedName("height")
    @Expose
    var height: Int? = null
        private set

    @SerializedName("src")
    @Expose
    var src: String? = null
        private set

    @SerializedName("variant_ids")
    @Expose
    var variantIds: List<Any>? = null
        private set

    @SerializedName("admin_graphql_api_id")
    @Expose
    var adminGraphqlApiId: String? = null
        private set
}