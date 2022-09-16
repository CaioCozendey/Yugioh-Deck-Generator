package com.example.yugiohdeckgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CardDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_detail)

        val toolbarCardDetail = supportActionBar
        toolbarCardDetail!!.title = ""
        toolbarCardDetail.setDisplayHomeAsUpEnabled(true)

    }
}