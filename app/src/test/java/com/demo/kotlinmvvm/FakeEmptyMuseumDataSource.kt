package com.demo.kotlinmvvm

import com.demo.kotlinmvvm.data.OperationResult
import com.demo.kotlinmvvm.model.Museum
import com.demo.kotlinmvvm.data.MuseumDataSource

/**
 
 */
class FakeEmptyMuseumDataSource : MuseumDataSource {

    override suspend fun retrieveMuseums(): OperationResult<Museum> {
        return OperationResult.Success(emptyList())
    }
}