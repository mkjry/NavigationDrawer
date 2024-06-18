package com.ssj.navigationdrawer.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.ssj.navigationdrawer.R
import com.ssj.navigationdrawer.databinding.Fragment4Binding

class Screen4Fragment : Fragment() {

    private var _binding: Fragment4Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = Fragment4Binding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.text4
        textView.text = getString(R.string.screen_4_string)

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}