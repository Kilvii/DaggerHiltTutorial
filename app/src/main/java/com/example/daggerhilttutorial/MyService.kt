package com.example.daggerhilttutorial

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.example.daggerhilttutorial.domain.repository.MyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MyService: Service() {

    @Inject
    lateinit var repository: MyRepository

    override fun onCreate() {
        super.onCreate()
//        repository.doNetworkCall()
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}