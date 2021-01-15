package com.example.backkkend.model

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "table_book_author_join", primaryKeys = ["book_id", "author_id"])
class BookAuthorJoin (
    @ColumnInfo(name = "book_id") val bookId: Long,
    @ColumnInfo(name = "author_id") val authorId: Long
)