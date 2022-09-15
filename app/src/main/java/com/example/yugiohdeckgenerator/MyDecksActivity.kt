package com.example.yugiohdeckgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class MyDecksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_decks)

        val toolbarGenerate = supportActionBar
        toolbarGenerate!!.title = ""
        toolbarGenerate.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.my_deck_options, menu)
        return true
    }
}