package com.example.testapplication.di

import android.app.Application
import androidx.room.Room
import com.example.testapplication.cloud.CloudApi
import com.example.testapplication.local.AppDatabase
import com.example.testapplication.repo.ProductRepository
import com.example.testapplication.ui.splash.SplashFragmentViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

fun initInjections(application: Application) {

	val viewModels = module {
		viewModel { SplashFragmentViewModel(get()) }
	}

	val services = module {
		single { CloudApi() }
	}

	val repository = module {
		single {
			Room.databaseBuilder(get(), AppDatabase::class.java, "database.sqlite")
				.build()
		}
		single { ProductRepository(get(), get()) }
	}

	startKoin {
		androidContext(application)
		modules(viewModels, services, repository)
	}
}
