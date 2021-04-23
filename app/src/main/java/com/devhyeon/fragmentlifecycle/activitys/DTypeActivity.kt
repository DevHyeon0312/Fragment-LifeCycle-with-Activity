package com.devhyeon.fragmentlifecycle.activitys

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.devhyeon.fragmentlifecycle.databinding.ActivityTypeDBinding
import com.devhyeon.fragmentlifecycle.fragments.BodyFragment
import com.devhyeon.fragmentlifecycle.fragments.TitleFragment

/**
 * activity 가 running 상태일때 Fragment를 삽입하여 LifeCycle 확인
 * */
class DTypeActivity : AppCompatActivity() {
    lateinit var binding : ActivityTypeDBinding
    companion object {
        private val TAG = "DevHyeon : " + DTypeActivity::class.java.name
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("$TAG : onCreate()")
        /** ViewBinding 의 코드이므로, Fragment LifeCycle Test 에 직접적인 연관이 없습니다. */
        binding = ActivityTypeDBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            supportFragmentManager.beginTransaction().add(binding.frameTitle.id, TitleFragment()).commit()
            supportFragmentManager.beginTransaction().add(binding.frameBody.id, BodyFragment()).commit()
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