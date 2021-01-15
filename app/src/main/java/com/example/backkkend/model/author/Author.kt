package com.example.backkkend.model.author

import androidx.room.*
import com.example.backkkend.model.BookAuthorJoin
import com.example.backkkend.model.book.Book

@Entity(tableName = "table_author")
data class Author(
    @ColumnInfo (name = "author_id") @PrimaryKey(autoGenerate = true) var id: Long? = null,
    @ColumnInfo (name = "author_first_name") var firstName: String,
    @ColumnInfo (name = "author_last_name") var lastName: String
)

data class AuthorsWithBook(
    @Embedded val author: Author,
    @Relation(
        parentColumn = "author_id",
        entityColumn = "book_id",
        associateBy = Junction(BookAuthorJoin::class)
    )
    val books: List<Book>
)