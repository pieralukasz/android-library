package com.example.backkkend.service

import com.example.backkkend.AppDatabase
import com.example.backkkend.dao.UserDao
import com.example.backkkend.model.user.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class UserStorageService(private val appDatabase: AppDatabase) {
    private val userDao: UserDao by lazy {
        appDatabase.userDao()
    }

    suspend fun getAll(): List<User> = withContext(Dispatchers.IO) {
        return@withContext userDao.getAll()
    }

    suspend fun addNewUser(user: User): Long = withContext(Dispatchers.IO) {
        return@withContext userDao.addNewUser(user)
    }

    suspend fun getUserById(id: Long): User? = withContext(Dispatchers.IO) {
        return@withContext userDao.getUserById(id)
    }

}