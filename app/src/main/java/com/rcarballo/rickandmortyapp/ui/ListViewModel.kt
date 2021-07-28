package com.rcarballo.rickandmortyapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rcarballo.rickandmortyapp.connection.RickAndMortyApi
import com.rcarballo.rickandmortyapp.util.RickAndMortyStatus
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import java.lang.Exception
import java.net.SocketTimeoutException
import java.net.UnknownHostException

class ListViewModel : ViewModel() {

    private val _status = MutableLiveData<RickAndMortyStatus>()
    val status: LiveData<RickAndMortyStatus>
        get() = _status


    val dataAllList = arrayListOf<Personaje>()

    val loadPage = MutableLiveData<Boolean>()


    private val _rickAndMortyData = MutableLiveData<ArrayList<Personaje>>()
    val rickAndMortyData: LiveData<ArrayList<Personaje>>
        get() = _rickAndMortyData

    private val _navigateToSelectedProperty = MutableLiveData<Personaje>()

    val navigateToSelectedProperty: LiveData<Personaje>
        get() = _navigateToSelectedProperty

    private var viewModelJob = Job()
    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main)

    init {
        coroutineScope.launch {
            getData(1)
        }
    }

    private fun getRickAndMortyData(page: Int) {
        coroutineScope.launch {
            try {
                if (page == 1) {
                    _status.value = RickAndMortyStatus.LOADING
                }
                if (page <= 34) {
                    var getRickAndMorty = RickAndMortyApi.retrofitService.getData(page)
                    if (getRickAndMorty.isSuccessful && getRickAndMorty.body() != null){
                        val dataRickAndMorty = getRickAndMorty.body()
                        if (dataRickAndMorty!!.results!!.isNotEmpty()) {
                            _status.value = RickAndMortyStatus.DONE
                            dataAllList.addAll(dataRickAndMorty.results)
                            _rickAndMortyData.value = dataAllList
                            loadPage.value = true
                        }
                    }else {
                        _status.value = RickAndMortyStatus.ERROR
                        _rickAndMortyData.value = ArrayList()
                    }
                }
            } catch (e: Exception){
                _status.value = RickAndMortyStatus.ERROR
                _rickAndMortyData.value = ArrayList()
            }
        }
    }

    private suspend fun getData(page: Int) {
        try {
            if (page == 1) {
                _status.value = RickAndMortyStatus.LOADING
            }
            if (page <= 34) {
                val response = RickAndMortyApi.retrofitService.getData(page)
                if (response.isSuccessful) {
                    val dataRickAndMorty = response.body()
                    if (dataRickAndMorty!!.results!!.isNotEmpty()) {
                        _status.value = RickAndMortyStatus.DONE
                        dataAllList.addAll(dataRickAndMorty.results)
                        _rickAndMortyData.value = dataAllList
                        loadPage.value = true
                    }
                } else {
                    _status.value = RickAndMortyStatus.ERROR
                    _rickAndMortyData.value = ArrayList()
                }
            }

        } catch (e: UnknownHostException) {
            //No hay conexión a Internet o el host no está disponible
            _status.value = RickAndMortyStatus.ERROR
            _rickAndMortyData.value = ArrayList()
        } catch (e: SocketTimeoutException) {
            //Se agota el tiempo de espera
            _status.value = RickAndMortyStatus.ERROR
            _rickAndMortyData.value = ArrayList()
        } catch (e: Exception) {
            _status.value = RickAndMortyStatus.ERROR
            _rickAndMortyData.value = ArrayList()
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }

    fun displayPropertyDetails(personaje: Personaje) {
        _navigateToSelectedProperty.value = personaje
    }

    fun displayPropertyDetailsComplete() {
        _navigateToSelectedProperty.value = null
    }

    //fun updateFilter(filter: RickAndMortyFilter) { }

    fun updatePage(page: Int) {
        loadPage.value = false
        coroutineScope.launch {
            getData(page)
        }
    }
}