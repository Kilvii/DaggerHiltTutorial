package com.example.daggerhilttutorial.domain.repository

interface MyRepository {

    suspend fun doNetworkCall()
}