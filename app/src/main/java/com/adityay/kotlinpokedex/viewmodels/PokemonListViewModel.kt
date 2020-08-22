package com.adityay.kotlinpokedex.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adityay.kotlinpokedex.models.Pokemon
import com.adityay.kotlinpokedex.repositories.PokedexRepo

class PokemonListViewModel : ViewModel() {
    val mPokemonList = MutableLiveData<List<Pokemon>>()


    fun fetchPokemonList(){
        PokedexRepo.getInstance().getPokemonList { isSuccess, response ->
            if(isSuccess){
                mPokemonList.value = response?.pokemon
            }else{
                mPokemonList.value = null
            }
        }
    }

}