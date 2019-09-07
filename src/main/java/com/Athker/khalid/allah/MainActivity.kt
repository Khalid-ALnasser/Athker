package com.Athker.khalid.allah

import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.Resources
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.widget.Button
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {

    lateinit var btn1: Button
    lateinit var  btn2 :Button

    lateinit var tt:Button

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
btn1=findViewById(R.id.button3)
        btn2=findViewById(R.id.button2)
        tt=findViewById(R.id.btn2m33)

        btn1.setTextSize(25F)
        btn2.setTextSize(25F)


                btn1.setOnClickListener {

                    var int = Intent(this, Main2Activity::class.java)
                    startActivity(int)


                }

        btn2.setOnClickListener{

            var int1=Intent(this,counter ::class.java)
            startActivity(int1)
        }
        tt.setOnClickListener {

            var int33251 = Intent(this, pryartime::class.java)
            startActivity(int33251)


        }
    }


}
