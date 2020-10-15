package com.example.testapplication.ui.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.testapplication.R
import org.koin.android.viewmodel.ext.android.viewModel

class SplashFragment : Fragment() {

    private val model: SplashFragmentViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        initViewModel()
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    private fun initViewModel() {
        model.initialize()
    }
}