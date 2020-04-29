package com.husaynhakeem.mergeadaptersample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.husaynhakeem.mergeadaptersample.differentviewholders.DifferentViewHoldersActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        differentViewHolders.setOnClickListener {
            startActivity(Intent(this, DifferentViewHoldersActivity::class.java))
        }

        sameViewHolders.setOnClickListener {
            startActivity(Intent(this, SameViewHoldersActivity::class.java))
        }

        complexViewHolders.setOnClickListener {
            startActivity(Intent(this, ComplexViewHoldersActivity::class.java))
        }
    }
}