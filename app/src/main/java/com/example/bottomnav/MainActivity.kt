package com.example.bottomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.bottomnav.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this@MainActivity,R.layout.activity_main)

        binding.bottomNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home->replaceFragment(HomeFragment())
                R.id.call->replaceFragment(CallFragment())
                R.id.profile->replaceFragment(ProfileFragment())
                R.id.setting->replaceFragment(SettingFragment())
            }
            true

        }
    }
    private fun replaceFragment(fragment: Fragment){
        val transation =supportFragmentManager.beginTransaction()
        transation.replace(R.id.fragment_navigation,fragment)
        transation.commit()
    }
}