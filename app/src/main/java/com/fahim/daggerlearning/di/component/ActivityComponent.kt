package com.fahim.daggerlearning.di.component

import com.fahim.dagger.learning.ui.main.MainActivity
import com.fahim.daggerlearning.di.ActivityScope
import com.fahim.daggerlearning.di.module.ActivityModule
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)

}