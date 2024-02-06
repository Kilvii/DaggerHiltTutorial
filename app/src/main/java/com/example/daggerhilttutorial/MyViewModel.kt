package com.example.daggerhilttutorial

import androidx.lifecycle.ViewModel
import com.example.daggerhilttutorial.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository:Lazy<MyRepository>
): ViewModel() {

    init {
//        repository.get()
    }
}