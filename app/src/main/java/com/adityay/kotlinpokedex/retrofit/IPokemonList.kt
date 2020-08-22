package com.adityay.kotlinpokedex.retrofit

import com.adityay.kotlinpokedex.models.Pokedex
import retrofit2.Call
import retrofit2.http.GET

interface IPokemonList {
    @GET("pokedex.json")
    fun getPokemonList() : Call<Pokedex>
}