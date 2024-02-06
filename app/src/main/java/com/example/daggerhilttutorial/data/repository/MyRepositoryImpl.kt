package com.example.daggerhilttutorial.data.repository

import android.app.Application
import com.example.daggerhilttutorial.R
import com.example.daggerhilttutorial.data.remote.MyApi
import com.example.daggerhilttutorial.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
): MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("Hello from repo. The app name is $appName")
    }

    override suspend fun doNetworkCall() {

    }
}