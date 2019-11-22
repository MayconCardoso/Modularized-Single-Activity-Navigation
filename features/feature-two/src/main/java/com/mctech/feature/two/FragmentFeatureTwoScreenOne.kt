package com.mctech.feature.two

import android.os.Bundle
import android.view.View
import com.mctech.library.shared_architecture.BaseFragmentExample
import kotlinx.android.synthetic.main.fragment_one_feature_two.*
import org.koin.android.ext.android.inject

/**
 * @author MAYCON CARDOSO on 2019-11-20.
 */
class FragmentFeatureTwoScreenOne : BaseFragmentExample<FeatureTwoNavigation>() {

    override val navigator: FeatureTwoNavigation by inject()

    override fun getLayoutResource() = R.layout.fragment_one_feature_two

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btGoToScreenTwo.setOnClickListener {
            navigator.navigateToScreenTwo()
        }
    }
}