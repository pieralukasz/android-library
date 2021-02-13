package com.example.backkkend.service

import android.util.Log
import androidx.room.Room
import com.example.backkkend.AppDatabase
import com.example.backkkend.appContext
import java.util.logging.Logger

object StorageService {

    private val appDatabase: AppDatabase by lazy {

        Room.databaseBuilder(
            appContext,
            AppDatabase::class.java, "app-database"
        ).build()
    }

    val userStorageService: UserStorageService by lazy {
        UserStorageService(appDatabase)
    }

    val bookStorageService: BookStorageService by lazy {
        BookStorageService(appDatabase)
    }

    val authorStorageService: AuthorStorageService by lazy {
        AuthorStorageService(appDatabase)
    }

    val bookAuthorStorageService: BookAuthorStorageService by lazy {
        BookAuthorStorageService(appDatabase)
    }


}

