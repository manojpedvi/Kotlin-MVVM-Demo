package com.demo.kotlinmvvm.di

import androidx.lifecycle.ViewModelProvider
import com.demo.kotlinmvvm.data.ApiClient
import com.demo.kotlinmvvm.data.MuseumDataSource
import com.demo.kotlinmvvm.data.MuseumRemoteDataSource
import com.demo.kotlinmvvm.model.MuseumRepository
import com.demo.kotlinmvvm.viewmodel.ViewModelFactory

/**
 
 */
object Injection {
    private var museumDataSource: MuseumDataSource? = null
    private var museumRepository: MuseumRepository? = null

    private fun createMuseumDataSource(): MuseumDataSource {
        val dataSource = MuseumRemoteDataSource(ApiClient)
        museumDataSource = dataSource
        return dataSource
    }

    private fun createMuseumRepository(): MuseumRepository {
        val repository = MuseumRepository(provideDataSource())
        museumRepository = repository
        return repository
    }

    private fun provideDataSource() = museumDataSource ?: createMuseumDataSource()

    private fun providerRepository() = museumRepository ?: createMuseumRepository()

    private val museumViewModelFactory = ViewModelFactory(providerRepository())
    fun provideViewModelFactory(): ViewModelProvider.Factory{
        return museumViewModelFactory
    }

    fun destroy() {
        museumDataSource = null
        museumRepository = null
    }
}