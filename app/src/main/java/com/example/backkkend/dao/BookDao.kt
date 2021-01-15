package com.example.backkkend.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.backkkend.model.book.Book


@Dao
interface BookDao {

    @Query("SELECT * FROM table_book")
    fun getAll(): List<Book>

    @Query("SELECT * FROM table_book WHERE book_id = :id")
    fun getBookById(id: Long): Book?

    // can be -1
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addNewBook(book: Book): Long
}