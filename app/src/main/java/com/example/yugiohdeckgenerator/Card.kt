package com.example.yugiohdeckgenerator

data class Card(
    val name: String,
    val card_images: CardImages,
    val atk: Int,
    val def: Int,
    val level: Int,
    val type: String,
    val Race: String,
    val desc: String
)

