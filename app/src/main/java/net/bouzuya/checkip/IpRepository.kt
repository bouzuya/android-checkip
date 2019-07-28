package net.bouzuya.checkip

class IpRepository(private val ipService: IpService) {
    suspend fun getIp() = ipService.getIp()
}
