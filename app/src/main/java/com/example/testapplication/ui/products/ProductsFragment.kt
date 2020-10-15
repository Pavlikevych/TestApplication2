package com.example.testapplication.ui.products

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testapplication.R
import kotlinx.android.synthetic.main.fragment_products_list.*
import org.koin.android.viewmodel.ext.android.viewModel

class ProductsFragment: Fragment() {

    private val model: ProductsFragmentViewModel by viewModel()
    private lateinit var adapter: ProductsAdapter

    private val productType by lazy {
        ProductsFragmentArgs.fromBundle(requireArguments()).productType
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_products_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initAdapter()
        initViewModel()
    }

    private fun initViewModel() {
        model.initialize(productType.orEmpty())
        model.products.observe(viewLifecycleOwner, Observer { list ->
            adapter.setupData(list)
        })
    }

    private fun initAdapter() {
        adapter = ProductsAdapter()
        val manager = LinearLayoutManager(requireContext())
        rvProducts.adapter = adapter
        rvProducts.layoutManager = manager
    }
}