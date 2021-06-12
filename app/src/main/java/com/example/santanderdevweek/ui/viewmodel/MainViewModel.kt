package com.example.santanderdevweek.ui.viewmodel


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.santanderdevweek.data.model.Conta
import com.example.santanderdevweek.data.local.localDataSource

class MainViewModel: ViewModel() {

    private val multableLiveData: MutableLiveData<Conta> = MutableLiveData()

    fun buscarContaCliente(): LiveData<Conta> {
        multableLiveData.value = localDataSource().getLocalData()
        return multableLiveData
    }

    class MainViewModelFactory(): ViewModelProvider.Factory{
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return MainViewModel() as T
        }

    }

}