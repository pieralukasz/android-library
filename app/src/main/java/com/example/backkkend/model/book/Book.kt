package com.example.backkkend.model.book

import androidx.room.*
import com.example.backkkend.model.BookAuthorJoin
import com.example.backkkend.model.author.Author
import com.example.backkkend.model.book.BookType
import com.example.backkkend.model.user.User
import java.util.*

@Entity (tableName = "table_book", foreignKeys = [
    ForeignKey(entity = User::class, parentColumns = ["user_id"], childColumns = ["current_user_id"])
])
data class Book(
    @ColumnInfo (name = "book_id") @PrimaryKey(autoGenerate = true) var id: Long? = null,
    @ColumnInfo (name = "book_title") var name: String,
    @ColumnInfo (name = "book_type") var type: BookType,
    @ColumnInfo (name = "book_date") var date: Date,
    @ColumnInfo (name = "current_user_id") var currentUserId: Long? = null
)


data class BookWithAuthors(
    @Embedded val book: Book,
    @Relation(
        parentColumn = "book_id",
        entityColumn = "author_id",
        associateBy = Junction(BookAuthorJoin::class)
    )
    val authors: List<Author>
)
