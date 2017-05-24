package com.cdi.kotlintest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import	kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        message.text = "Are you Ok ~ Kotlin!"
//        message.setText("Are you Ok ~ Kotlin!");
    }
}

/**
 * public class MainActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }
    }
 */
