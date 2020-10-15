package com.example.testapplication.cloud.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class VariantAPI {
    @SerializedName("id")
    @Expose
    var id: Int? = null
        private set

    @SerializedName("product_id")
    @Expose
    var productId: Int? = null
        private set

    @SerializedName("title")
    @Expose
    var title: String? = null
        private set

    @SerializedName("price")
    @Expose
    var price: String? = null
        private set

    @SerializedName("sku")
    @Expose
    var sku: String? = null
        private set

    @SerializedName("position")
    @Expose
    var position: Int? = null
        private set

    @SerializedName("inventory_policy")
    @Expose
    var inventoryPolicy: String? = null
        private set

    @SerializedName("compare_at_price")
    @Expose
    var compareAtPrice: Any? = null
        private set

    @SerializedName("fulfillment_service")
    @Expose
    var fulfillmentService: String? = null
        private set

    @SerializedName("inventory_management")
    @Expose
    var inventoryManagement: Any? = null
        private set

    @SerializedName("option1")
    @Expose
    var option1: String? = null
        private set

    @SerializedName("option2")
    @Expose
    var option2: Any? = null
        private set

    @SerializedName("option3")
    @Expose
    var option3: Any? = null
        private set

    @SerializedName("created_at")
    @Expose
    var createdAt: String? = null
        private set

    @SerializedName("updated_at")
    @Expose
    var updatedAt: String? = null
        private set

    @SerializedName("taxable")
    @Expose
    var taxable: Boolean? = null
        private set

    @SerializedName("barcode")
    @Expose
    var barcode: Any? = null
        private set

    @SerializedName("grams")
    @Expose
    var grams: Int? = null
        private set

    @SerializedName("image_id")
    @Expose
    var imageId: Any? = null
        private set

    @SerializedName("weight")
    @Expose
    var weight: Double? = null
        private set

    @SerializedName("weight_unit")
    @Expose
    var weightUnit: String? = null
        private set

    @SerializedName("inventory_item_id")
    @Expose
    var inventoryItemId: Int? = null
        private set

    @SerializedName("inventory_quantity")
    @Expose
    var inventoryQuantity: Int? = null
        private set

    @SerializedName("old_inventory_quantity")
    @Expose
    var oldInventoryQuantity: Int? = null
        private set

    @SerializedName("requires_shipping")
    @Expose
    var requiresShipping: Boolean? = null
        private set

    @SerializedName("admin_graphql_api_id")
    @Expose
    var adminGraphqlApiId: String? = null
        private set
}