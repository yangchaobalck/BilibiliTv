package com.jing.bilibilitv.resource

sealed class Resource<T>() {
    class Loading<T> : Resource<T>()

    data class Success<T>(val data: T) : Resource<T>()

    data class Error<T>(val message: String?) : Resource<T>()
}
