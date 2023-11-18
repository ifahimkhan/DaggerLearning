package com.fahim.daggerlearning

import android.app.Application
import com.fahim.daggerlearning.data.local.DatabaseService
import com.fahim.daggerlearning.data.remote.NetworkService
import com.fahim.daggerlearning.di.ApplicationScope
import com.fahim.daggerlearning.di.component.ApplicationComponent
import com.fahim.daggerlearning.di.component.DaggerApplicationComponent
import com.fahim.daggerlearning.di.module.ApplicationModule
import javax.inject.Inject

@ApplicationScope
class MyApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    @Inject
    lateinit var databaseService: DatabaseService

    @Inject
    lateinit var networkService: NetworkService

    override fun onCreate() {
        super.onCreate()
        getDependencies()
    }

    private fun getDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }

}