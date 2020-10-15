package com.example.testapplication.local

import androidx.room.TypeConverter
import com.example.testapplication.local.model.*
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


class DatabaseConverters {

	@TypeConverter
	fun fromProductTypeList(value: List<Int>): String {
		val gson = Gson()
		return gson.toJson(value)
	}

	@TypeConverter
	fun toProductTypeList(value: String): List<Int> {
		val type = object : TypeToken<List<Int>>() {}.type
		return Gson().fromJson(value, type)
	}

	@TypeConverter
	fun fromProductList(value: List<Product>): String {
		val gson = Gson()
		return gson.toJson(value)
	}

	@TypeConverter
	fun toProductList(value: String): List<Product> {
		val type = object : TypeToken<List<Product>>() {}.type
		return Gson().fromJson(value, type)
	}

	@TypeConverter
	fun fromVariantList(value: List<Variant>): String {
		val gson = Gson()
		return gson.toJson(value)
	}

	@TypeConverter
	fun toVariantList(value: String): List<Variant> {
		val type = object : TypeToken<List<Variant>>() {}.type
		return Gson().fromJson(value, type)
	}

	@TypeConverter
	fun fromOptionList(value: List<Option>): String {
		val gson = Gson()
		return gson.toJson(value)
	}

	@TypeConverter
	fun toOptionList(value: String): List<Option> {
		val type = object : TypeToken<List<Option>>() {}.type
		return Gson().fromJson(value, type)
	}

	@TypeConverter
	fun fromImageList(value: List<Image>): String {
		val gson = Gson()
		return gson.toJson(value)
	}

	@TypeConverter
	fun toImageList(value: String): List<Image> {
		val type = object : TypeToken<List<Image>>() {}.type
		return Gson().fromJson(value, type)
	}

	@TypeConverter
	fun fromImagesList(value: Images): String {
		val gson = Gson()
		return gson.toJson(value)
	}

	@TypeConverter
	fun toImagesList(value: String): Images {
		val type = object : TypeToken<List<Images>>() {}.type
		return Gson().fromJson(value, type)
	}
}