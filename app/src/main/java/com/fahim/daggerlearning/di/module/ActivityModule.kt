package com.fahim.daggerlearning.di.module

import android.app.Activity
import android.content.Context
import com.fahim.daggerlearning.di.ActivityContext
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: Activity) {

    @ActivityContext
    @Provides
    fun provideContext(): Context {
        return activity
    }

}