package net.bouzuya.checkip

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class IpRepository(private val ipService: IpService) {
    fun getIp(): LiveData<String> {
        return MutableLiveData<String>().also { data ->
            ipService.getIp().enqueue(object : Callback<String> {
                override fun onFailure(call: Call<String>, t: Throwable) {
                    TODO("not implemented")
                }

                override fun onResponse(call: Call<String>, response: Response<String>) {
                    data.postValue(response.body())
                }
            })
        }
    }
}
