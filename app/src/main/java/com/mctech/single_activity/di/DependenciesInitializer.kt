package com.mctech.single_activity.di

import android.app.Application
import com.mctech.single_activity.di.modules.navigatorModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

/**
 * @author MAYCON CARDOSO on 2019-11-21.
 */
class DependenciesInitializer {
    companion object {
        operator fun invoke(application: Application) {
            startKoin {
                androidLogger()
                androidContext(application)
                modules(
                    listOf(
                        navigatorModule
                    )
                )
            }
        }
    }
}