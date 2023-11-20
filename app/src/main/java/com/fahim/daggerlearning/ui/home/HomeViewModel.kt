package com.fahim.dagger.learning.ui.home

import com.fahim.daggerlearning.data.local.DataManager
import com.fahim.daggerlearning.data.local.DatabaseService
import com.fahim.daggerlearning.data.local.FileStorageService
import com.fahim.daggerlearning.data.local.PrefUtils
import com.fahim.daggerlearning.data.remote.NetworkService
import com.fahim.daggerlearning.di.FragmentScope
import javax.inject.Inject

@FragmentScope
class HomeViewModel @Inject constructor(
    val databaseService: DatabaseService,
    val networkService: NetworkService,
    val fileStorageService1: FileStorageService,
    val fileStorageService2: FileStorageService,
    val prefUtils: PrefUtils,
    val dataManager: DataManager
) {


    fun getSomeData(): String {
        return " databaseService : " + databaseService.getDummyData() + "\n" +
                " databaseServiceHashCode : " + databaseService.hashCode() + "\n" +
                " datamanager : " + dataManager.hashCode() + "\n" +
                " datamanager pref: " + prefUtils.getDataManagerHashcode() + "\n" +
                " prefUtils : " + prefUtils.getPrefutilsHashcode() + "\n" +
                " prefUtils pref: " + prefUtils.hashCode() + "\n" +
                " networkService : " + networkService.getDummyData() + "\n" +
                " networkServiceHashCode : " + networkService.hashCode() + "\n" +
                " fileStorageService1HashCode : " + fileStorageService1.hashCode() + "\n" +
                " fileStorageService2HashCode : " + fileStorageService2.hashCode()
    }

}
