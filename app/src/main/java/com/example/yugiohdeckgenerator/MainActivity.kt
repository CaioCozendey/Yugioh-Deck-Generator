package com.example.yugiohdeckgenerator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val generateDeck = findViewById<Button>(R.id.generateDeckBtn)
        val myDecks = findViewById<Button>(R.id.myDecksBtn)
        val allCards = findViewById<Button>(R.id.allCardsBtn)

        generateDeck.setOnClickListener {
            val intent = Intent(this, GenerateDeckActivity::class.java)
            startActivity(intent)
        }

        myDecks.setOnClickListener {
            val intent = Intent(this, MyDecksActivity::class.java)
            startActivity(intent)
        }

        allCards.setOnClickListener {
            val intent = Intent(this, AllCardsActivity::class.java)
            startActivity(intent)
        }
    }
}