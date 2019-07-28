package net.bouzuya.checkip

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class IpViewModel(repository: IpRepository) : ViewModel() {
    val name = "IP"
    private val _ip: MutableLiveData<String> = MutableLiveData()
    val ip = _ip

    init {
        viewModelScope.launch {
            _ip.postValue(repository.getIp())
        }
    }
}
