package com.wagnerm.nutrirbem

import android.content.*
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wagnerm.nutrirbem.ui.login.LoginActivity
import kotlinx.coroutines.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        GlobalScope.launch { // launch a new coroutine in background and continue
            delay(3000L) // non-blocking delay for 1 second (default time unit is ms)
            val it = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(it)
        }
    }
}