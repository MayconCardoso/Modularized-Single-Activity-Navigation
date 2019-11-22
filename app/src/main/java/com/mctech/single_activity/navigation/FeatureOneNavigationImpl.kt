package com.mctech.single_activity.navigation

import com.mctech.feature.one.FeatureOneNavigation
import com.mctech.single_activity.R

/**
 * @author MAYCON CARDOSO on 2019-11-21.
 */
internal class FeatureOneNavigationImpl : com.mctech.library.shared_architecture.BaseNavigator(), FeatureOneNavigation {
    override fun navigateToScreenTwo() {
        navController?.navigate(R.id.action_fragmentFeatureOneScreenOne_to_fragmentFeatureOneScreenTwo)
    }

    override fun navigateToFeatureTwo() {
        navController?.navigate(R.id.action_global_feature_two)
    }
}