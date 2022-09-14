package com.example.yugiohdeckgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class GenerateDeckActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generate_deck)

        val toolbarGenerate = supportActionBar
        toolbarGenerate!!.title = "kappa"
        toolbarGenerate.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.generate_deck_option, menu)
        return true
    }
}