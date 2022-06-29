package com.example.calculator

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var mutableList = MutableLiveData<String>()
    val liveData: LiveData<String> get() = mutableList

    fun eval(expersion: MutableList<String>) {
        mutableList.value = MathModel.mathhandler(expersion)
    }

    fun deleteNumber(expersion: String) {
        mutableList.value=MathModel.deleteNumber(expersion)
    }

}