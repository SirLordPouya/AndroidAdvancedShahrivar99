package com.sematec.android.advanced.shahrivar99.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sematec.android.advanced.shahrivar99.Person
import kotlinx.coroutines.launch

class TestViewModel(private val model: TestModel) : ViewModel() {
    val personLiveData = MutableLiveData<List<Person>>()

    fun getUsers() {
        viewModelScope.launch {
            val data = model.getUsers()
            personLiveData.postValue(data)
        }
    }
}