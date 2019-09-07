package com.Athker.khalid.allah

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView

class Main2Activity : AppCompatActivity() {
lateinit var btc:Button
    lateinit var btm:Button
    lateinit var bty:Button
    lateinit var tvt:Button
   // var count :Int=0
    lateinit var py:ProgressBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btc=findViewById(R.id.btn2m)
        btm=findViewById(R.id.btn2m1)
        bty=findViewById(R.id.btn2m2)



        btc.setOnClickListener {
            var intbtc=Intent(this,Moring ::class.java)
            startActivity(intbtc)

        }
        btm.setOnClickListener {
            var intbtc=Intent(this,Night ::class.java)
            startActivity(intbtc)

        }
        bty.setOnClickListener {
            var intbtc=Intent(this,sleep ::class.java)
            startActivity(intbtc)

        }
        }
      //  tvt.setOnClickListener { count++
      //   tvt.text="click my"+count }
       // bty.setOnClickListener { }

    }


