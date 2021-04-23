package com.devhyeon.fragmentlifecycle.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.devhyeon.fragmentlifecycle.databinding.FragmentBodyBinding

class BodyFragment : Fragment() {
    private var _binding: FragmentBodyBinding? = null
    private val binding get() = _binding!!

    companion object {
        private val TAG = "DevHyeon : " + BodyFragment::class.java.name
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        println("$TAG : onAttach()")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("$TAG : onCreate()")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBodyBinding.inflate(inflater, container, false)
        println("$TAG : onCreateView()")
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("$TAG : onViewCreated()")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        println("$TAG : onViewStateRestored()")
    }

    override fun onStart() {
        super.onStart()
        println("$TAG : onStart()")
    }

    override fun onResume() {
        super.onResume()
        println("$TAG : onResume()")
    }

    override fun onPause() {
        super.onPause()
        println("$TAG : onPause()")
    }

    override fun onStop() {
        super.onStop()
        println("$TAG : onStop()")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        println("$TAG : onSaveInstanceState()")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        println("$TAG : onDestroyView()")
        _binding = null
    }

    override fun onDestroy() {
        super.onDestroy()
        println("$TAG : onDestroy()")
    }

}