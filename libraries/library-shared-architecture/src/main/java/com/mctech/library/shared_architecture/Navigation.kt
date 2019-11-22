package com.mctech.library.shared_architecture

import androidx.navigation.NavController

/**
 * @author MAYCON CARDOSO on 2019-11-21.
 */
interface Navigation {
    fun bind(navController: NavController)
    fun unbind()
}