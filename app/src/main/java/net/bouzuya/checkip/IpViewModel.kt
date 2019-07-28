package net.bouzuya.checkip

import androidx.lifecycle.ViewModel

class IpViewModel(repository: IpRepository) : ViewModel() {
    val name = "IP"
    val ip = repository.getIp()
}
