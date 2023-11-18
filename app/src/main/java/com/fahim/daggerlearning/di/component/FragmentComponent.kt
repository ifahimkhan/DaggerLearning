package com.fahim.daggerlearning.di.component

import com.fahim.dagger.learning.ui.home.HomeFragment
import com.fahim.daggerlearning.di.FragmentScope
import com.fahim.daggerlearning.di.module.FragmentModule
import dagger.Component

@FragmentScope
@Component(dependencies = [ApplicationComponent::class], modules = [FragmentModule::class])
interface FragmentComponent {

    fun inject(homeFragment: HomeFragment)

}