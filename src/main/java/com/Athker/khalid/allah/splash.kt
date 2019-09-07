package com.Athker.khalid.allah

import android.app.ActivityOptions
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.LinearLayout

class splash : AppCompatActivity() {
lateinit var  ssap1: LinearLayout
    lateinit var ssap2:LinearLayout
    lateinit var an:Animation
    lateinit var sn:Animation
    lateinit var pn:Animation

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            val intt=Intent(this,MainActivity ::class.java)
            startActivity(intt)
            finish()
            pn=AnimationUtils.loadAnimation(this,R.anim.fade_out)


        },3000)
        ssap1=findViewById(R.id.ssp1)
        ssap2=findViewById(R.id.ssp2)

        an=AnimationUtils.loadAnimation(this,R.anim.sp)
        sn=AnimationUtils.loadAnimation(this,R.anim.np)
        ssap1.animation=an

        ssap2.animation=sn



    }
}
