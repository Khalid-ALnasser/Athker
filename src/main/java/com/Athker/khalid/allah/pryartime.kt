package com.Athker.khalid.allah

import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_pryartime.*
import org.json.JSONArray
import java.net.HttpURLConnection
import java.net.URL
import android.widget.BaseAdapter
import android.widget.Spinner
import android.widget.Toast
import com.Athker.khalid.allah.Model.Salat

class pryartime : AppCompatActivity(),SalatView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pryartime)






        SalatPresent(this).getDataFromAPI("Riyadh")




    }


    override fun onDateCompleteFromAPI(Salat: Salat.Item) {

        txtf1.text=Salat.fajr
        txtd1.text = Salat.dhuhr
        txts11.text=Salat.asr
        txtg1.text=Salat.maghrib
        txte1.text=Salat.isha
    }

    override fun onDateError(throwable: Throwable) {
        error("error -------> ${throwable.localizedMessage}")
    }


}






