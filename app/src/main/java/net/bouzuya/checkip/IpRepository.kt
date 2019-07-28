package net.bouzuya.checkip

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class IpRepository {
    fun getIp(): LiveData<String> = MutableLiveData<String>().also { it.value = "127.0.0.1" }
}
