package com.example.myapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    
    private val _message = MutableLiveData<String>("Hello World!")
    val message: LiveData<String> = _message
    
    fun updateMessage() {
        _message.value = "Hello Android!"
    }
    
    fun resetMessage() {
        _message.value = "Hello World!"
    }
} 