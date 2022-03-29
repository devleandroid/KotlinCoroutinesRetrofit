package br.com.framework.coroutines.data.repository

import br.com.framework.coroutines.data.api.ApiHelper
import br.com.framework.coroutines.data.api.ApiService

class MainRepository(private val apiHelper: ApiHelper) {
    suspend fun getAllUsers() = apiHelper.getAllUsers()
}