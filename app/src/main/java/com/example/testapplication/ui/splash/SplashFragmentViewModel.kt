package com.example.testapplication.ui.splash

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testapplication.repo.ProductRepository
import kotlinx.coroutines.launch
import kotlin.coroutines.coroutineContext

class SplashFragmentViewModel(
    private val moviesRepo: ProductRepository
) : ViewModel() {


    fun initialize() {
        viewModelScope.launch {
            moviesRepo.getAllProduct()
        }
    }
}