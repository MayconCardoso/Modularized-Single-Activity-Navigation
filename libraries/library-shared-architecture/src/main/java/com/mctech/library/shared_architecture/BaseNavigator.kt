package com.mctech.library.shared_architecture

import androidx.navigation.NavController

/**
 * @author MAYCON CARDOSO on 2019-11-21.
 */
abstract class BaseNavigator : Navigation {
    protected var navController: NavController? = null

    override fun bind(navController: NavController) {
        this.navController = navController
    }

    override fun unbind() {
        navController = null
    }
}