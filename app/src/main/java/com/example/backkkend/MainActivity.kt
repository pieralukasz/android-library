package com.example.backkkend

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.backkkend.AppDatabase
import com.example.backkkend.model.User
import com.example.backkkend.service.StorageService
import com.example.backkkend.ui.MainViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

lateinit var appContext: Context

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        appContext = this


        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        val reference = StorageService.userStorageService

        val user = User(null, "Aleks", "Reksio", 123456)

        GlobalScope.launch {
            reference.addNewUser(user)
        }

    }
}