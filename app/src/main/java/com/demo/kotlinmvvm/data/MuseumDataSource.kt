package com.demo.kotlinmvvm.data

import com.demo.kotlinmvvm.model.Museum

/**
 
 */

interface MuseumDataSource {
    suspend fun retrieveMuseums() : OperationResult<Museum>
}