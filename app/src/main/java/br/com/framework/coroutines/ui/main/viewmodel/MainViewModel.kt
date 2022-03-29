package br.com.framework.coroutines.ui.main.viewmodel

import androidx.lifecycle.*
import br.com.framework.coroutines.data.model.User
import br.com.framework.coroutines.data.repository.MainRepository
import br.com.framework.coroutines.utils.Resource
import kotlinx.coroutines.Dispatchers

class MainViewModel(private val mainRepository: MainRepository): ViewModel() {

    private val listUsers = MutableLiveData<List<User>>()

    fun getAllsUsers() = listUsers

    init {
        getAllUsers()
    }


    fun getAllUsers() = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = mainRepository.getAllUsers()))
            listUsers.postValue(mainRepository.getAllUsers())
        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Erro ocorrido!"))
        }
    }

}