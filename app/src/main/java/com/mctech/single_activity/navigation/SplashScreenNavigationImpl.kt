package com.mctech.single_activity.navigation

import com.mctech.feature.splashscreen.SplashScreenNavigation
import com.mctech.single_activity.R

/**
 * @author MAYCON CARDOSO on 2019-11-21.
 */
internal class SplashScreenNavigationImpl : com.mctech.library.shared_architecture.BaseNavigator(), SplashScreenNavigation {
    override fun navigateToFeatureOne() {
        navController?.navigate(R.id.action_global_feature_one)
    }

    override fun navigateToFeatureTwo() {
        navController?.navigate(R.id.action_global_feature_two)
    }
}