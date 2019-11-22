package com.mctech.single_activity.navigation

import com.mctech.feature.two.FeatureTwoNavigation
import com.mctech.single_activity.R

/**
 * @author MAYCON CARDOSO on 2019-11-21.
 */
internal class FeatureTwoNavigationImpl : com.mctech.library.shared_architecture.BaseNavigator(), FeatureTwoNavigation {
    override fun navigateToScreenTwo() {
        navController?.navigate(R.id.action_fragmentFeatureOneScreenOne_to_fragmentFeatureTwoScreenTwo)
    }
}