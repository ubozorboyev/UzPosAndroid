package com.example.uzposandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/*
 dp = px / (dpi / 160)
.75  yoq ldpi( 120dpi)
1.0  ustiga mdpi( 160dpi; asosiy)
1.5  yoq hdpi( 240dpi)
2.0  yoq xhdpi( 320dpi)
3.0  yoq xxhdpi( 480dpi)
4.0  yoq xxxhdpi( 640dpi)
*/