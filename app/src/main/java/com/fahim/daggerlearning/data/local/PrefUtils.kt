package com.fahim.daggerlearning.data.local

import android.content.Context
import android.content.SharedPreferences
import com.fahim.daggerlearning.di.ApplicationContext
import com.fahim.daggerlearning.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PrefUtils @Inject constructor(@ApplicationContext val context: Context) {

    private val sharedPreferences: SharedPreferences by lazy {
        getSharedPreferenceInstance()
    }

    private fun getSharedPreferenceInstance(): SharedPreferences {
        return context.getSharedPreferences(
            getDefaultSharedPreferencesName(context),
            getDefaultSharedPreferencesMode()
        )
    }

    companion object {
        private fun getDefaultSharedPreferencesMode(): Int {
            return Context.MODE_PRIVATE
        }

        private fun getDefaultSharedPreferencesName(context: Context): String {
            return "${context.packageName}_preferences"
        }
    }

    fun savePrefutilsHashcode(mapping: String?) {
        val editor = sharedPreferences.edit()
        editor.putString("savePrefutilsHashcode", mapping)
        editor.apply()
    }

    fun getPrefutilsHashcode(): String? {
        return sharedPreferences.getString("savePrefutilsHashcode", "")
    }

    fun saveDataManagerHashcode(mapping: String?) {
        val editor = sharedPreferences.edit()
        editor.putString("saveDataManagerHashcode", mapping)
        editor.apply()
    }

    fun getDataManagerHashcode(): String? {
        return sharedPreferences.getString("saveDataManagerHashcode", "")
    }
}
