package com.demo.kotlinmvvm.model

import com.demo.kotlinmvvm.data.MuseumDataSource
import com.demo.kotlinmvvm.data.OperationResult

/**
 
 */
class MuseumRepository(private val dataSource: MuseumDataSource) {

    suspend fun fetchMuseums(): OperationResult<Museum> = dataSource.retrieveMuseums()
}