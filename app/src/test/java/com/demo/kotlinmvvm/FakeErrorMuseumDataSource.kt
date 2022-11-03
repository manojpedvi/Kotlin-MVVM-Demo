package com.demo.kotlinmvvm

import com.demo.kotlinmvvm.data.OperationResult
import com.demo.kotlinmvvm.model.Museum
import com.demo.kotlinmvvm.data.MuseumDataSource

/**
 
 */
class FakeErrorMuseumDataSource : MuseumDataSource {

    private val mockException = Exception("Ocurrió un error")

    override suspend fun retrieveMuseums(): OperationResult<Museum> {
        return OperationResult.Error(mockException)
    }
}