package com.devhyeon.fragmentlifecycle.activitys

import android.app.Activity
import android.os.Bundle
import android.view.Window
import com.devhyeon.fragmentlifecycle.databinding.DialogSampleBinding

class MyDialogActivity : Activity() {
    lateinit var binding : DialogSampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        binding = DialogSampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener {
            finish()
        }
    }
}