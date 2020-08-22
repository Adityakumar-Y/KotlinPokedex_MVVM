package com.adityay.kotlinpokedex.repositories

import com.adityay.kotlinpokedex.models.Pokedex
import com.adityay.kotlinpokedex.retrofit.IPokemonList
import com.adityay.kotlinpokedex.retrofit.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PokedexRepo{
    companion object{
        private var instance : PokedexRepo? = null
        fun getInstance() = instance ?: PokedexRepo().also { instance = it }
    }

    fun getPokemonList(onResult: (isSuccess: Boolean, response: Pokedex?) -> Unit){
        val service = RetrofitClient.buildService(IPokemonList::class.java)
        val call = service.getPokemonList()
        call.enqueue(object : Callback<Pokedex> {
            override fun onFailure(call: Call<Pokedex>, t: Throwable) {
                //Toast.makeText(activity!!, "Error", Toast.LENGTH_SHORT).show()
                onResult(false, null)
            }

            override fun onResponse(call: Call<Pokedex>, response: Response<Pokedex>) {
                if(response.isSuccessful && response.code() == 200 && response.body() != null){
                    onResult(true, response.body()!!)

                }else{
                    onResult(false, null)
                }
            }

        })
    }
}