package com.example.testapplication.ui.splash

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testapplication.repo.ProductRepository
import kotlinx.coroutines.launch

class SplashFragmentViewModel(
    private val productRepository: ProductRepository
) : ViewModel() {

    var failureLiveData = productRepository.failureLiveData

    fun initialize() {
        viewModelScope.launch {
            productRepository.getAllProduct()
        }
    }
}