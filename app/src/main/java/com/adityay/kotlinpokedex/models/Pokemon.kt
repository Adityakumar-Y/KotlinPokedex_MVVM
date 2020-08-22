package com.adityay.kotlinpokedex.models


import com.google.gson.annotations.SerializedName

data class Pokemon(
    @SerializedName("avg_spawns")
    var avgSpawns: Double? = null,
    @SerializedName("candy")
    var candy: String? = null,
    @SerializedName("candy_count")
    var candyCount: Int? = null,
    @SerializedName("egg")
    var egg: String? = null,
    @SerializedName("height")
    var height: String? = null,
    @SerializedName("id")
    var id: Int? = null,
    @SerializedName("img")
    var img: String? = null,
    @SerializedName("multipliers")
    var multipliers: List<Double>? = null,
    @SerializedName("name")
    var name: String? = null,
    @SerializedName("next_evolution")
    var nextEvolution: List<NextEvolution>? = null,
    @SerializedName("num")
    var num: String? = null,
    @SerializedName("prev_evolution")
    var prevEvolution: List<PrevEvolution>? = null,
    @SerializedName("spawn_chance")
    var spawnChance: Double? = null,
    @SerializedName("spawn_time")
    var spawnTime: String? = null,
    @SerializedName("type")
    var type: List<String>? = null,
    @SerializedName("weaknesses")
    var weaknesses: List<String>? = null,
    @SerializedName("weight")
    var weight: String? = null
)