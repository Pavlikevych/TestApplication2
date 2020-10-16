package com.example.testapplication.ui.tag_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testapplication.R
import kotlinx.android.synthetic.main.fragment_tags_list.*
import org.koin.android.viewmodel.ext.android.viewModel


class TagsListFragment : Fragment(), OnProductTypeClickListener {

    private val model: TagsListFragmentViewModel by viewModel()
    private lateinit var adapter: TagsListAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tags_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initAdapter()
        initViewModel()
        handleBackPressed()
    }

    private fun initViewModel() {
        model.initialize()
        model.productsType.observe(viewLifecycleOwner, Observer { list ->
            adapter.setupData(list)
        })
    }

    private fun initAdapter() {
        adapter = TagsListAdapter(this)
        val manager = LinearLayoutManager(requireContext())
        rvProductsType.adapter = adapter
        rvProductsType.layoutManager = manager
    }

    private fun handleBackPressed() {
        requireActivity().onBackPressedDispatcher.addCallback(
            viewLifecycleOwner, object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    requireActivity().finish()
                }
            })
    }

    override fun onProductTypeClick(type: String) {
        val navController = NavHostFragment.findNavController(this)
        val bundle = bundleOf(BUNDLE_PRODUCT_TYPE to type)
        if (navController.currentDestination?.id == R.id.tags_list_fragment) {
            navController.navigate(R.id.action_tags_list_to_products, bundle)
        }
    }
}

interface OnProductTypeClickListener {
    fun onProductTypeClick(type: String)
}

const val BUNDLE_PRODUCT_TYPE = "productType"