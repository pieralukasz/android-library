package com.example.backkkend.service

import androidx.room.Room
import com.example.backkkend.AppDatabase
import com.example.backkkend.appContext

object StorageService {

    private val appDatabase: AppDatabase by lazy {
        Room.databaseBuilder(
            appContext,
            AppDatabase::class.java, "database"
        ).build()
    }

    val userStorageService: UserStorageService by lazy {
        UserStorageService(appDatabase)
    }


}

