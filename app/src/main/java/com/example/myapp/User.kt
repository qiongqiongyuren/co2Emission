package com.example.myapp

data class User(
    val id: Int,
    val name: String,
    val email: String,
    val age: Int
) {
    fun getDisplayName(): String {
        return "$name ($age)"
    }
} 