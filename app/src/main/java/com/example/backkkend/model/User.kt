package com.example.backkkend.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "test_data_user")
data class User(
    @ColumnInfo(name = "user_id") @PrimaryKey(autoGenerate = true) var id: Long? = null,
    @ColumnInfo(name = "user_first_name") var firstName: String,
    @ColumnInfo(name = "user_last_name") var lastName: String,
    @ColumnInfo(name = "user_phone_number") var phoneNumber: Int
 )
