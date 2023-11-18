package com.fahim.daggerlearning.data.remote

import android.content.Context
import com.fahim.daggerlearning.di.ApiKey
import com.fahim.daggerlearning.di.ApplicationContext
import com.fahim.daggerlearning.di.ApplicationScope
import javax.inject.Inject

@ApplicationScope
class NetworkService @Inject constructor(
    val httpClient: HttpClient,
    @ApplicationContext private val context: Context,
    @ApiKey private val apikey: String
) {
    fun getDummyData(): String {
        return "NETWORK_DUMMY_DATA"
    }
}