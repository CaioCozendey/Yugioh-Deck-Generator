package com.example.yugiohdeckgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class AllCardsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_cards)

        val toolbarGenerate = supportActionBar
        toolbarGenerate!!.title = ""
        toolbarGenerate.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.generate_deck_option, menu)
        return true
    }
}