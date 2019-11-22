package com.mctech.single_activity.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.mctech.feature.splashscreen.SplashScreenNavigation
import com.mctech.single_activity.R
import org.koin.android.ext.android.inject

/**
 * @author MAYCON CARDOSO on 2019-11-21.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.application_nav_graph).navigateUp()
    }
}
