package com.example.backkkend.service

import com.example.backkkend.AppDatabase
import com.example.backkkend.dao.BookAuthorDao
import com.example.backkkend.model.author.AuthorsWithBook
import com.example.backkkend.model.book.Book
import com.example.backkkend.model.book.BookWithAuthors
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class BookAuthorStorageService(private val appDatabase: AppDatabase) {
    private val bookAuthorDao: BookAuthorDao by lazy {
        appDatabase.bookAuthorDao()
    }

    suspend fun getBookWithAuthors(): List<BookWithAuthors> = withContext(Dispatchers.IO) {
        return@withContext bookAuthorDao.getBookWithAuthors()
    }

    suspend fun getAuthorsWithBook(): List<AuthorsWithBook> = withContext(Dispatchers.IO) {
        return@withContext bookAuthorDao.getAuthorsWithBook()
    }

    suspend fun getAllBookWithAuthorsById(id: Long): List<BookWithAuthors> = withContext(Dispatchers.IO) {
        return@withContext getAllBookWithAuthorsById(id)
    }

    suspend fun getAllAuthorsWithBookWithId(id: Long): List<AuthorsWithBook> = withContext(Dispatchers.IO) {
        return@withContext getAllAuthorsWithBookWithId(id)
    }


}