package br.com.framework.coroutines.data.api

import br.com.framework.coroutines.data.model.User
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getAllUsers(): List<User>
}