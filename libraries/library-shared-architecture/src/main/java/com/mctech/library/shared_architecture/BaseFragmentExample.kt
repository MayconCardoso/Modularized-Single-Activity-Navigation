package com.mctech.library.shared_architecture

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

/**
 * @author MAYCON CARDOSO on 2019-11-20.
 */
abstract class BaseFragmentExample<NAV : Navigation> : Fragment() {

    abstract val navigator: NAV
    abstract fun getLayoutResource(): Int

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(getLayoutResource(), container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        navigator.bind(findNavController())
    }

    override fun onDestroy() {
        navigator.unbind()
        super.onDestroy()
    }
}