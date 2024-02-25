package com.sidorin.wiitsky

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sidorin.wiitsky.fragments.MainFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.placeholder, MainFragment.newInstance()).commit()

    }
}