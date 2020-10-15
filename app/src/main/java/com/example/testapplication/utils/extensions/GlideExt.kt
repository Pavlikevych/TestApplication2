package com.example.testapplication.utils.extensions

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.testapplication.R

fun ImageView.loadWithGlide(url: String) {
	Glide.with(context)
		.load(url)
		.centerCrop()
		.placeholder(context.getDrawable(R.drawable.ic_launcher_background))
		.circleCrop()
		.into(this)
}