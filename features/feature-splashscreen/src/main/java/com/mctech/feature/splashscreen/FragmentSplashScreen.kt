package com.mctech.feature.splashscreen

import android.os.Bundle
import android.view.View
import com.mctech.library.shared_architecture.BaseFragmentExample
import kotlinx.android.synthetic.main.fragment_splashscreen.*
import org.koin.android.ext.android.inject

/**
 * @author MAYCON CARDOSO on 2019-11-20.
 */
class FragmentSplashScreen : BaseFragmentExample<SplashScreenNavigation>() {

    override val navigator: SplashScreenNavigation by inject()

    override fun getLayoutResource() = R.layout.fragment_splashscreen

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btGoFeatureOne.setOnClickListener {
            navigator.navigateToFeatureOne()
        }

        btGoFeatureTwo.setOnClickListener {
            navigator.navigateToFeatureTwo()
        }
    }
}