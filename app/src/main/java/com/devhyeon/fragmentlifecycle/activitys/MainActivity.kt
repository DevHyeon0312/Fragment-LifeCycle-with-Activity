package com.devhyeon.fragmentlifecycle.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.devhyeon.fragmentlifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    companion object {
        private val TAG = "DevHyeon : " + MainActivity::class.java.name
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /** ViewBinding 의 코드이므로, Fragment LifeCycle Test 에 직접적인 연관이 없습니다. */
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    /** activity_main.xml 의 Button 에서 직접 호출 */
    fun startActivity(view : View) {
        var intent : Intent? = null
        when(view.id) {
            binding.btnTypeA.id -> {
                intent = Intent(this@MainActivity, ATypeActivity::class.java)
            }
            binding.btnTypeB.id -> {
                intent = Intent(this@MainActivity, BTypeActivity::class.java)
            }
            binding.btnTypeC.id -> {
                intent = Intent(this@MainActivity, CTypeActivity::class.java)
            }
            binding.btnTypeD.id -> {
                intent = Intent(this@MainActivity, DTypeActivity::class.java)
            }
        }
        if ( intent != null ) startActivity(intent)
    }
}