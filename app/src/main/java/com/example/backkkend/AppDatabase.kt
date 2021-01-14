package com.example.backkkend

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.backkkend.dao.UserDao
import com.example.backkkend.model.User

@Database (entities = [User::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun userDao(): UserDao
}