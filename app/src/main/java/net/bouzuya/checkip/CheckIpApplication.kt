package net.bouzuya.checkip

import android.app.Application

class CheckIpApplication : Application() {
    fun getIpRepository(): IpRepository = IpRepository()
}