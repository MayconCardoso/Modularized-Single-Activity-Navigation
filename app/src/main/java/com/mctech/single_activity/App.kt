package com.mctech.single_activity

import android.app.Application
import com.mctech.single_activity.di.DependenciesInitializer

/**
 * @author MAYCON CARDOSO on 2019-11-21.
 */
class App : Application(){
    override fun onCreate() {
        super.onCreate()
        DependenciesInitializer.invoke(this)
    }
}
