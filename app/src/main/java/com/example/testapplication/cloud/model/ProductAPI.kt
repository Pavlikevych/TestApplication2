package com.example.testapplication.cloud.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ProductAPI {
    @SerializedName("id")
    @Expose
    var id: Int? = null
        private set

    @SerializedName("title")
    @Expose
    var title: String? = null
        private set

    @SerializedName("body_html")
    @Expose
    var bodyHtml: String? = null
        private set

    @SerializedName("vendor")
    @Expose
    var vendor: String? = null
        private set

    @SerializedName("product_type")
    @Expose
    var productType: String? = null
        private set

    @SerializedName("created_at")
    @Expose
    var createdAt: String? = null
        private set

    @SerializedName("handle")
    @Expose
    var handle: String? = null
        private set

    @SerializedName("updated_at")
    @Expose
    var updatedAt: String? = null
        private set

    @SerializedName("published_at")
    @Expose
    var publishedAt: String? = null
        private set

    @SerializedName("template_suffix")
    @Expose
    var templateSuffix: Any? = null
        private set

    @SerializedName("published_scope")
    @Expose
    var publishedScope: String? = null
        private set

    @SerializedName("tags")
    @Expose
    var tags: String? = null
        private set

    @SerializedName("admin_graphql_api_id")
    @Expose
    var adminGraphqlApiId: String? = null
        private set

    @SerializedName("variants")
    @Expose
    var variantAPIS: List<VariantAPI>? = null
        private set

    @SerializedName("options")
    @Expose
    var optionAPIS: List<OptionAPI>? = null
        private set

    @SerializedName("images")
    @Expose
    var imageAPIS: List<ImageAPI>? = null
        private set

    @SerializedName("image")
    @Expose
    var image: ImagesAPI? = null
        private set
}