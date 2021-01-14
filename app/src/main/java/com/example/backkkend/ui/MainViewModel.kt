package com.example.backkkend.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.backkkend.model.User
import com.example.backkkend.service.StorageService
import com.example.backkkend.service.UserStorageService

class MainViewModel: ViewModel() {
    private val userStorageService: UserStorageService by lazy {
        StorageService.userStorageService
    }

    val users: MutableLiveData<List<User>> by lazy {
        MutableLiveData<List<User>>()
    }.apply { this.value.value = listOf() }


}
