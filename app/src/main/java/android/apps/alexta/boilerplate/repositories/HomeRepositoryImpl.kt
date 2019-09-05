package android.apps.alexta.boilerplate.repositories

import javax.inject.Inject

class HomeRepositoryImpl @Inject constructor(): HomeRepository {

    override fun getHomeList() = listOf("Alex", "Edu", "Emilio")

}