package com.adityay.kotlinpokedex.models


import com.google.gson.annotations.SerializedName

data class Pokedex(
    @SerializedName("pokemon")
    var pokemon: List<Pokemon>? = null
)