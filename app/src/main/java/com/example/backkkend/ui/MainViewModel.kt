package com.example.backkkend.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.backkkend.model.author.Author
import com.example.backkkend.model.user.User
import com.example.backkkend.service.*
import kotlinx.coroutines.launch
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.util.*

class MainViewModel: ViewModel() {
    private val timeDateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm")

    private val userStorageService: UserStorageService by lazy {
        StorageService.userStorageService
    }

    private val bookStorageService: BookStorageService by lazy {
        StorageService.bookStorageService
    }

    private val authorStorageService: AuthorStorageService by lazy {
        StorageService.authorStorageService
    }

    private val bookAuthorStorageService: BookAuthorStorageService by lazy {
        StorageService.bookAuthorStorageService
    }

    val users: MutableLiveData<List<User>> by lazy {
        MutableLiveData<List<User>>()
    }.apply { this.value.value = listOf() }

    val clock: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }.apply {
        this.value.value = ZonedDateTime.now().format(timeDateTimeFormatter)
    }

    companion object {
        private val clockTimer = Timer()
    }

    init {
        clockTimer.scheduleAtFixedRate(object: TimerTask() {
            override fun run() {
              viewModelScope.launch {
                  clock.value = ZonedDateTime.now().format(timeDateTimeFormatter)
              }
            }
        },1000, 1000)
    }

    fun addNewAuthor(author: Author) {
        viewModelScope.launch {
            authorStorageService.addNewAuthor(author)
        }
    }

    fun loadAllUsers() {
        viewModelScope.launch {
            val allUsers = userStorageService.getAll()
            users.value = allUsers
        }
    }


}
