package com.devhyeon.fragmentlifecycle.activitys

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.devhyeon.fragmentlifecycle.R
import com.devhyeon.fragmentlifecycle.databinding.ActivityTypeCBinding

/**
 * activity 의 LifeCycle 에 따른 Fragment LifeCycle 확인
 * */
class CTypeActivity : AppCompatActivity() {
    lateinit var binding : ActivityTypeCBinding
    
    companion object {
        private val TAG = "DevHyeon : " + CTypeActivity::class.java.name
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("$TAG : onCreate()")
        /** ViewBinding 의 코드이므로, Fragment LifeCycle Test 에 직접적인 연관이 없습니다. */
        binding = ActivityTypeCBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            startActivity(Intent(this@CTypeActivity,MyDialogActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        println("$TAG : onStart()")
    }

    override fun onRestart() {
        super.onRestart()
        println("$TAG : onRestart()")
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

    override fun onDestroy() {
        super.onDestroy()
        println("$TAG : onDestroy()")
    }
}