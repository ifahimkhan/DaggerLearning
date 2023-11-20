package com.fahim.daggerlearning.di.component

import android.content.SharedPreferences
import com.fahim.dagger.learning.ui.home.HomeFragment
import com.fahim.daggerlearning.data.local.DataManager
import com.fahim.daggerlearning.di.FragmentScope
import com.fahim.daggerlearning.di.module.FragmentModule
import dagger.Component

@FragmentScope
@Component(dependencies = [ApplicationComponent::class], modules = [FragmentModule::class])
interface FragmentComponent {

    fun inject(homeFragment: HomeFragment)

}