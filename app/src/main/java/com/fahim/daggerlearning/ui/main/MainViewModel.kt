package com.fahim.dagger.learning.ui.main

import com.fahim.daggerlearning.data.local.DatabaseService
import com.fahim.daggerlearning.data.remote.NetworkService
import com.fahim.daggerlearning.di.ActivityScope

import javax.inject.Inject

@ActivityScope
class MainViewModel @Inject constructor(
    private val databaseService: DatabaseService,
    private val networkService: NetworkService
) {

    fun getSomeData(): String {
        return "dsHashCode: " + databaseService.hashCode() + "\n" + "nsHashCode: " + networkService.hashCode()
    }

}
