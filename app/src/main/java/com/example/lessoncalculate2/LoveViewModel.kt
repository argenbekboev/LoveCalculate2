package com.example.lessoncalculate2

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.lessoncalculate2.remote.LoveModel

class LoveViewModel: ViewModel() {

    val repository = Repository()

    fun liveModel(firstName: String, secondName: String): LiveData<LoveModel> {
        return repository.getLiveLoveModel(firstName,secondName)
    }
}