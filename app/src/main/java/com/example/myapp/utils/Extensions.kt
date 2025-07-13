package com.example.myapp.utils

import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

// Fragment扩展函数
fun Fragment.showToast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(requireContext(), message, duration).show()
}

// Activity扩展函数
fun FragmentActivity.showToast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}

// String扩展函数
fun String.isValidEmail(): Boolean {
    return android.util.Patterns.EMAIL_ADDRESS.matcher(this).matches()
}

// Int扩展函数
fun Int.isEven(): Boolean {
    return this % 2 == 0
}

// List扩展函数
fun <T> List<T>.getRandomItem(): T? {
    return if (this.isNotEmpty()) this.random() else null
} 