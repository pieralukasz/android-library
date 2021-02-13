package com.example.backkkend.service

import com.example.backkkend.AppDatabase
import com.example.backkkend.dao.AuthorDao
import com.example.backkkend.model.author.Author
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class AuthorStorageService(private val appDatabase: AppDatabase) {
    private val authorDao: AuthorDao by lazy {
        appDatabase.authorDao()
    }

    suspend fun getAllAuthors(): List<Author> = withContext(Dispatchers.IO) {
        return@withContext authorDao.getAllAuthors()
    }

    suspend fun addNewAuthor(author: Author): Long = withContext(Dispatchers.IO) {
        return@withContext authorDao.addNewAuthor(author)
    }
}