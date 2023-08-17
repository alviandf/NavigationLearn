package com.alviandf.navigationlearn.ui.main.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import com.alviandf.navigationlearn.R
import com.alviandf.navigationlearn.databinding.FragmentHomeBinding
import com.alviandf.navigationlearn.ui.main.MainFragment

class HomeFragment : Fragment() {

    private var rootView: View? = null

    private var isInitialized = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (rootView == null) {
            rootView = inflater.inflate(
                R.layout.fragment_home,
                container,
                false
            )
        }
        return rootView!!
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (isInitialized) return
        isInitialized = true

        val textView: TextView = view.findViewById(R.id.text_home)
        textView.text = "Home Fragment 12"
        textView.setOnClickListener {
            findNavController(requireActivity(), R.id.nav_host_activity_main)
                .navigate(R.id.navigation_detail)
        }
    }
}