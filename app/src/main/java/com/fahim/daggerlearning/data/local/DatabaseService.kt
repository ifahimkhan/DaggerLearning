package com.fahim.daggerlearning.data.local

import android.content.Context
import com.fahim.daggerlearning.di.ApplicationContext
import com.fahim.daggerlearning.di.ApplicationScope
import com.fahim.daggerlearning.di.DatabaseName
import com.fahim.daggerlearning.di.DatabaseVersion
import javax.inject.Inject

@ApplicationScope
class DatabaseService @Inject constructor(
    @ApplicationContext  val context: Context,
    @DatabaseName  val databaseName: String,
    @DatabaseVersion  val version: Int
) {
    fun getDummyData(): String {
        return "DATABASE_DUMMY_DATA"
    }
}