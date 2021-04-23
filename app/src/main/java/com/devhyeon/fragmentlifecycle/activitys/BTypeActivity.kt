package com.devhyeon.fragmentlifecycle.activitys

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.devhyeon.fragmentlifecycle.databinding.ActivityTypeBBinding
import com.devhyeon.fragmentlifecycle.fragments.BodyFragment
import com.devhyeon.fragmentlifecycle.fragments.TitleFragment

/**
 * activity_type_b.xml 에서 ViewGroup 을 삽입해두고, Code 에서 ViewGroup 에 Fragment 를 삽입하는 경우
 * */
class BTypeActivity : AppCompatActivity() {
    lateinit var binding : ActivityTypeBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /** ViewBinding 의 코드이므로, Fragment LifeCycle Test 에 직접적인 연관이 없습니다. */
        binding = ActivityTypeBBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().add(binding.frameTitle.id, TitleFragment()).commit()
            supportFragmentManager.beginTransaction().add(binding.frameBody.id, BodyFragment()).commit()
        }
    }
}