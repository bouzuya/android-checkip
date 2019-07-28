package net.bouzuya.checkip

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class IpViewModelFactory(private val context: Context) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val application = context.applicationContext as CheckIpApplication
        return IpViewModel(application.getIpRepository()) as T
    }
}
