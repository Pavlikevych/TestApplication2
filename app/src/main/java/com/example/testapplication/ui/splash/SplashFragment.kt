package com.example.testapplication.ui.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.NavHostFragment
import com.example.testapplication.R
import com.example.testapplication.utils.extensions.toast
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
        model.failureLiveData.observe(viewLifecycleOwner, Observer { bool ->
            if(bool) requireActivity().toast(R.string.something_went_wrong)
            else goToTagsListScreen()
        })
    }

    private fun goToTagsListScreen() {
        val navController = NavHostFragment.findNavController(this)
        if (navController.currentDestination?.id == R.id.splash_fragment) {
            navController.navigate(R.id.action_splash_to_tags_list)
        }
    }
}