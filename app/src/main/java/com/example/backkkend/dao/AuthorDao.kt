package com.example.backkkend.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.backkkend.model.author.Author

@Dao
interface AuthorDao {

    @Query("SELECT * FROM table_author")
    fun getAllAuthors(): List<Author>

    // can be -1
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addNewAuthor(author: Author): Long

}