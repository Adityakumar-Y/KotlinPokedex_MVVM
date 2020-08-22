package com.adityay.kotlinpokedex.views


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import com.adityay.kotlinpokedex.R
import com.adityay.kotlinpokedex.adapters.PokemonListAdapter
import com.adityay.kotlinpokedex.models.Pokemon
import com.adityay.kotlinpokedex.viewmodels.PokemonListViewModel

class PokemonListFragment : Fragment() {

    lateinit var adapter : PokemonListAdapter
    lateinit var rvPokemon : RecyclerView
    private lateinit var viewmodel : PokemonListViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val itemView =  inflater.inflate(R.layout.fragment_pokemon_list, container, false)
        rvPokemon = itemView.findViewById(R.id.rv_pokemon) as RecyclerView
        viewmodel = ViewModelProviders.of(this).get(PokemonListViewModel::class.java)
        viewmodel.fetchPokemonList()
        fetchPokemon()
        return itemView
    }

    private fun fetchPokemon() {
        viewmodel.mPokemonList.observe(this, Observer<List<Pokemon>>{
            if(it != null) {
                adapter = PokemonListAdapter(activity!!, it)
                rvPokemon.adapter = adapter
            }else{
                Toast.makeText(activity!!, "Error", Toast.LENGTH_SHORT).show()
            }
        })
    }


}
