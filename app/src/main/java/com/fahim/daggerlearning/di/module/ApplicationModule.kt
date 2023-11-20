package com.fahim.daggerlearning.di.module

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.fahim.daggerlearning.MyApplication
import com.fahim.daggerlearning.data.local.FileStorageService
import com.fahim.daggerlearning.data.local.PrefUtils
import com.fahim.daggerlearning.data.remote.HttpClient
import com.fahim.daggerlearning.di.ApiKey
import com.fahim.daggerlearning.di.ApplicationContext
import com.fahim.daggerlearning.di.ApplicationScope
import com.fahim.daggerlearning.di.DatabaseName
import com.fahim.daggerlearning.di.DatabaseVersion
import dagger.Module
import dagger.Provides
import java.util.prefs.Preferences
import javax.inject.Singleton


@Module
class ApplicationModule(private val application: MyApplication) {

    @ApplicationContext
    @Provides
    fun provideContext(): Context {
        return application
    }

    @Provides
    fun provideHttpClient(): HttpClient {
        return HttpClient()
    }


    @ApiKey
    @Provides
    fun provideApiKey(): String {
        return "SOME_API_KEY"
    }

    @ApplicationScope
    @Provides
    fun provideFileStorage(): FileStorageService {
        return FileStorageService()
    }

    @DatabaseVersion
    @Provides
    fun provideDatabaseVersion(): Int {
        return 1
    }

    @DatabaseName
    @Provides
    fun provideDatabaseName(): String {
        return "Some_DB_NAME"
    }



}