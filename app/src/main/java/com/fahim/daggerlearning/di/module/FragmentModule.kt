package com.fahim.daggerlearning.di.module

import android.content.Context
import androidx.fragment.app.Fragment
import com.fahim.daggerlearning.di.ActivityContext
import com.fahim.daggerlearning.di.ApplicationContext
import dagger.Module
import dagger.Provides

@Module
class FragmentModule(private val fragment: Fragment) {

    @ActivityContext
    @Provides
    fun provideContext(): Context {
        return fragment.requireContext()
    }
}