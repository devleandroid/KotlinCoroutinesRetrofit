package br.com.framework.coroutines.data.api

class ApiHelper(private val apiService: ApiService) {
    suspend fun getAllUsers() = apiService.getAllUsers()
}