package com.example.testapplication.utils.extensions

fun Int.toLongOrNull() = try {
	this.toLong()
} catch (e: Exception) {
	null
}