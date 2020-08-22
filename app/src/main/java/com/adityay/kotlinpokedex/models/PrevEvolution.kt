package com.adityay.kotlinpokedex.models


import com.google.gson.annotations.SerializedName

data class PrevEvolution(
    @SerializedName("name")
    var name: String? = null,
    @SerializedName("num")
    var num: String? = null
)