package com.example.backkkend.service

import com.example.backkkend.AppDatabase
import com.example.backkkend.dao.BookDao
import com.example.backkkend.model.book.Book
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class BookStorageService(private val appDatabase: AppDatabase) {
    private val bookDao: BookDao by lazy {
        appDatabase.bookDao()
    }

    suspend fun getAll(): List<Book> = withContext(Dispatchers.IO) {
        return@withContext bookDao.getAll()
    }

    suspend fun addNewBook(book: Book): Long = withContext(Dispatchers.IO) {
        return@withContext bookDao.addNewBook(book)
    }

    suspend fun getBookById(id: Long): Book? = withContext(Dispatchers.IO) {
        return@withContext bookDao.getBookById(id)
    }
}


