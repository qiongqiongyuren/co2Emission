package com.example.myapp.network

import com.example.myapp.model.User  // ✅ 加上这一行，导入 User
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>

    @GET("user")
    suspend fun getUserById(@Query("id") id: Int): User?
}

// ✅ 网络响应数据类（你暂时没用，但可以保留）
data class ApiResponse<T>(
    val success: Boolean,
    val data: T?,
    val message: String?
)
