package com.example.backkkend.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.example.backkkend.model.author.AuthorsWithBook
import com.example.backkkend.model.book.BookWithAuthors

@Dao
interface BookAuthorDao {

    @Transaction
    @Query ("SELECT * FROM table_book")
    fun getBookWithAuthors(): List<BookWithAuthors>

    @Transaction
    @Query ("SELECT * FROM table_author")
    fun getAuthorsWithBook(): List<AuthorsWithBook>

    @Transaction
    @Query ("SELECT * FROM table_book WHERE book_id = :id")
    fun getAllBookWithAuthorsById(id: Long): List<BookWithAuthors>

    @Transaction
    @Query ("SELECT * FROM table_author WHERE author_id = :id")
    fun getAllAuthorsWithBookById(id: Long): List<BookWithAuthors>
}
