package com.example.bajajjetpackcomponents

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelClass : ViewModel() {
    fun updateLiveData() {

        factsLiveData.value= "New Fact"
    }

    var factsLiveData = MutableLiveData<String>("my fact 1")
}