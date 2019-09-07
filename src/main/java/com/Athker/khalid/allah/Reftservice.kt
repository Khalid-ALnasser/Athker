package com.Athker.khalid.allah

import com.Athker.khalid.allah.Model.Salat
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface Reftservice {

    @GET("{City}.json?key=808a6b62c3710c7b133d6ff24c18c07a")
    fun getAPI(@Path("City")City: String):Call<Salat>

    companion object{

        fun creat():Reftservice{
            val retrofit=Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("https://muslimsalat.com")
                    .build()
            return retrofit.create(Reftservice::class.java)
        }

    }
}