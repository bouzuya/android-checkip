package net.bouzuya.checkip

import retrofit2.http.GET

interface IpService {
    @GET("/")
    suspend fun getIp(): String
}
