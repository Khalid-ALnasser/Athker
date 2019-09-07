package com.Athker.khalid.allah

import android.content.ClipData
import android.content.Context
import com.Athker.khalid.allah.Model.Salat
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SalatPresent(context: Context){

    val salatView =context as SalatView

    fun getDataFromAPI(City:String) = Reftservice.creat()
            .getAPI(City)
            .enqueue(object : Callback<Salat>{
                override fun onFailure(call: Call<Salat>, t: Throwable) {

                    salatView.onDateError(t)
                }

                override fun onResponse(call: Call<Salat>, response: Response<Salat>) {
                    salatView.onDateCompleteFromAPI(response.body()?.items?.get(0)as Salat.Item)
                }


            })
}