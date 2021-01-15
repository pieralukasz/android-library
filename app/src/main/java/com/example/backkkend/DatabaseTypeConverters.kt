package com.example.backkkend

import androidx.room.TypeConverter
import com.example.backkkend.model.book.BookType

class DatabaseTypeConverters {

    @TypeConverter
    fun bookTypeToString(bookType: BookType): String = bookType.toString()

    @TypeConverter
    fun stringToBookType(value: String?): BookType? = if (value != null) BookType.valueOf(value) else null
}