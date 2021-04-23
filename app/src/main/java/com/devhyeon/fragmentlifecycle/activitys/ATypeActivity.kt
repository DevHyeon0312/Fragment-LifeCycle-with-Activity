package com.devhyeon.fragmentlifecycle.activitys

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.devhyeon.fragmentlifecycle.databinding.ActivityTypeABinding

/**
 * activity_type_a.xml 에서 <Fragment> 를 사용하여 삽입 한 경우
 * */
class ATypeActivity : AppCompatActivity() {
    lateinit var binding : ActivityTypeABinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /** ViewBinding 의 코드이므로, Fragment LifeCycle Test 에 직접적인 연관이 없습니다. */
        binding = ActivityTypeABinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}