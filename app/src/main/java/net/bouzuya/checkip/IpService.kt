package net.bouzuya.checkip

import retrofit2.Call
import retrofit2.http.GET

interface IpService {
    @GET("/")
    fun getIp(): Call<String>
}
