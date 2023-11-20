package com.fahim.daggerlearning.data.local

import android.content.Context
import android.content.SharedPreferences
import com.fahim.daggerlearning.di.ApplicationContext
import com.fahim.daggerlearning.di.ApplicationScope
import javax.inject.Inject

@ApplicationScope
class PrefUtils @Inject constructor(@ApplicationContext val context: Context) {

    companion object {
        private fun getDefaultSharedPreferencesMode(): Int {
            return Context.MODE_PRIVATE
        }

        private fun getDefaultSharedPreferencesName(context: Context): String {
            return context.packageName + "_preferences"
        }

        private fun getSharedPreferenceInstanced(context: Context): SharedPreferences {
            return context.getSharedPreferences(
                getDefaultSharedPreferencesName(context),
                getDefaultSharedPreferencesMode()
            )
        }
    }


    fun savePrefutilsHashcode(mapping: String?) {
        val editor: SharedPreferences.Editor =
            getSharedPreferenceInstanced(context).edit()
        editor.putString("savePrefutilsHashcode", mapping)
        editor.apply()
    }

    fun getPrefutilsHashcode(): String? {
        return getSharedPreferenceInstanced(context).getString("savePrefutilsHashcode", "")
    }

    fun saveDataManagerHashcode(mapping: String?) {
        val editor: SharedPreferences.Editor =
            getSharedPreferenceInstanced(context).edit()
        editor.putString("saveDataManagerHashcode", mapping)
        editor.apply()
    }

    fun getDataManagerHashcode(): String? {
        return getSharedPreferenceInstanced(context).getString("saveDataManagerHashcode", "")
    }

}