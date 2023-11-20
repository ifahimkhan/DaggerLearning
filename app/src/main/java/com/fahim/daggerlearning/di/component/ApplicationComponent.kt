package com.fahim.daggerlearning.di.component

import android.content.Context
import android.content.SharedPreferences
import android.provider.ContactsContract.Data
import com.fahim.daggerlearning.MyApplication
import com.fahim.daggerlearning.data.local.DataManager
import com.fahim.daggerlearning.data.local.DatabaseService
import com.fahim.daggerlearning.data.local.FileStorageService
import com.fahim.daggerlearning.data.local.PrefUtils
import com.fahim.daggerlearning.data.remote.NetworkService
import com.fahim.daggerlearning.di.ApplicationContext
import com.fahim.daggerlearning.di.ApplicationScope
import com.fahim.daggerlearning.di.module.ApplicationModule
import dagger.Component

@ApplicationScope
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: MyApplication)

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getDatabaseService(): DatabaseService

    fun getFileStorageService(): FileStorageService

    fun getPrefUtils(): PrefUtils

    fun getDataManager():DataManager
}