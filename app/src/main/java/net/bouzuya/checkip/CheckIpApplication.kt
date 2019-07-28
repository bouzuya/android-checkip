package net.bouzuya.checkip

import android.app.Application
import okhttp3.ResponseBody
import retrofit2.Converter
import retrofit2.Retrofit
import java.lang.reflect.Type


class CheckIpApplication : Application() {
    fun getIpRepository(): IpRepository = IpRepository(
        Retrofit.Builder()
            .baseUrl("https://checkip.amazonaws.com")
            .addConverterFactory(object : Converter.Factory() {
                override
                fun responseBodyConverter(
                    type: Type, annotations: Array<Annotation>,
                    retrofit: Retrofit
                ): Converter<ResponseBody, String> {
                    return Converter { it.string() }
                }
            })
            .build()
            .create(IpService::class.java)
    )
}