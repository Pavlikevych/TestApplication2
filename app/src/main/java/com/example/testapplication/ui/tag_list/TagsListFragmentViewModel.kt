package com.example.testapplication.ui.tag_list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testapplication.local.model.ProductType
import com.example.testapplication.repo.ProductRepository
import com.example.testapplication.utils.SingleLiveEvent
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class TagsListFragmentViewModel(
    private val productRepository: ProductRepository
) : ViewModel() {

    val productsType by lazy { SingleLiveEvent<List<ProductType>>() }

    fun initialize() {
        viewModelScope.launch {
            productRepository.observeProductsType().collect{ data ->
                productsType.value = data
            }
        }
    }
}