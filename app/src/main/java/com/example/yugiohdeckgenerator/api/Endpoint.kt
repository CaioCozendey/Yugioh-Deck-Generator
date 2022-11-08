package com.example.yugiohdeckgenerator.api

import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.GET

interface Endpoint {
    @GET("https://db.ygoprodeck.com/api/v7/cardinfo.php")
    fun getCurrencies() : Call<JsonObject>


}