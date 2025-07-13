package com.example.myapp.network

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    
    @GET("users")
    suspend fun getUsers(): List<User>
    
    @GET("user")
    suspend fun getUserById(@Query("id") id: Int): User?
}

// 网络响应数据类
data class ApiResponse<T>(
    val success: Boolean,
    val data: T?,
    val message: String?
) 