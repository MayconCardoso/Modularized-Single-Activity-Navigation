package com.mctech.single_activity.di.modules

import com.mctech.feature.one.FeatureOneNavigation
import com.mctech.feature.splashscreen.SplashScreenNavigation
import com.mctech.feature.two.FeatureTwoNavigation
import com.mctech.single_activity.navigation.FeatureOneNavigationImpl
import com.mctech.single_activity.navigation.FeatureTwoNavigationImpl
import com.mctech.single_activity.navigation.SplashScreenNavigationImpl
import org.koin.dsl.module

/**
 * @author MAYCON CARDOSO on 2019-11-21.
 */
val navigatorModule = module {

    factory<SplashScreenNavigation> {
        SplashScreenNavigationImpl()
    }

    factory<FeatureOneNavigation> {
        FeatureOneNavigationImpl()
    }

    factory<FeatureTwoNavigation> {
        FeatureTwoNavigationImpl()
    }
}