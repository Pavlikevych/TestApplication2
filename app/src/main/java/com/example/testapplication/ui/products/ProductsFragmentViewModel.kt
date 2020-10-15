package com.example.testapplication.ui.products

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testapplication.local.model.Product
import com.example.testapplication.repo.ProductRepository
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class ProductsFragmentViewModel(
    private val productRepository: ProductRepository
) : ViewModel() {
    val products by lazy { MutableLiveData<List<Product>>() }

    fun initialize(type: String) {
        viewModelScope.launch {
            productRepository.observeProductsByType(type).collect{ data ->
                products.value = data
            }
        }
    }
}