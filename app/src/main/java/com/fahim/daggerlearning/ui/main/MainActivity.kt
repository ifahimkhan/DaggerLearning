package com.fahim.dagger.learning.ui.main

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.fahim.dagger.learning.ui.home.HomeFragment
import com.fahim.daggerlearning.MyApplication
import com.fahim.daggerlearning.R
import com.fahim.daggerlearning.data.local.DataManager
import com.fahim.daggerlearning.data.local.PrefUtils
import com.fahim.daggerlearning.di.component.DaggerActivityComponent
import com.fahim.daggerlearning.di.module.ActivityModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: MainViewModel

    @Inject
    lateinit var prefUtils: PrefUtils

    @Inject
    lateinit var dataManager: DataManager


    override fun onCreate(savedInstanceState: Bundle?) {
        getDependencies()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        prefUtils.savePrefutilsHashcode(prefUtils.hashCode().toString())
        prefUtils.saveDataManagerHashcode(dataManager.hashCode().toString())



        Toast.makeText(
            this,
            viewModel.getSomeData(),
            Toast.LENGTH_LONG
        ).show()

        addHomeFragment()
    }

    private fun addHomeFragment() {
        if (supportFragmentManager.findFragmentByTag(HomeFragment.TAG) == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.container_fragment, HomeFragment.newInstance(), HomeFragment.TAG)
                .commit()
        }
    }

    private fun getDependencies() {
        DaggerActivityComponent
            .builder()
            .applicationComponent((application as MyApplication).applicationComponent)
            .activityModule(ActivityModule(this))
            .build()
            .inject(this)
    }

}
