package com.example.motionlayoutex01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /**
         * Motion Layout Basic
         * setContentView(R.layout.activity_main)
         */

        /**
         * Motion Layout Coordinator
         */
        setContentView(R.layout.motion_coordinator)
    }
}