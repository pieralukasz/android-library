package com.example.backkkend

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.backkkend.dao.BookDao
import com.example.backkkend.dao.BookAuthorDao
import com.example.backkkend.dao.UserDao
import com.example.backkkend.model.user.User

@Database (entities = [User::class], version = 1)
@TypeConverters(DatabaseTypeConverters::class)
abstract class AppDatabase: RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun bookDao(): BookDao
    abstract fun bookAuthorDao(): BookAuthorDao
}