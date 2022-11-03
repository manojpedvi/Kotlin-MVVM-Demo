package com.demo.kotlinmvvm.data

import com.demo.kotlinmvvm.model.Museum

data class MuseumResponse(val status: Int?, val msg: String?, val data: List<Museum>?) {
    fun isSuccess(): Boolean = (status == 200)
}