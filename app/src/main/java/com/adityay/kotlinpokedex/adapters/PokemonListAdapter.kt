package com.adityay.kotlinpokedex.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.adityay.kotlinpokedex.R
import com.adityay.kotlinpokedex.models.Pokemon
import com.bumptech.glide.Glide

class PokemonListAdapter (private var context:Context, private var pokemonList:List<Pokemon>) : RecyclerView.Adapter<PokemonListAdapter.PokemonViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.pokemon_list_item, parent, false)
        return PokemonViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return pokemonList.size
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        Glide.with(context).load(pokemonList[position].img).into(holder.img_pokemon)
        holder.txt_pokemon.text = pokemonList[position].name
    }

    inner class PokemonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        internal var img_pokemon : ImageView = itemView.findViewById(R.id.pokemon_image) as ImageView
        internal var txt_pokemon : TextView = itemView.findViewById(R.id.pokemon_name) as TextView
    }
}