package com.example.backkkend.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.backkkend.model.User

@Dao
interface UserDao {

    @Query("SELECT * FROM test_data_user")
    fun getAll(): List<User>

    @Query("SELECT * FROM test_data_user WHERE user_id = :id")
    fun getUserById(id: Long): User?


    // can be -1
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addNewUser(user: User): Long
}