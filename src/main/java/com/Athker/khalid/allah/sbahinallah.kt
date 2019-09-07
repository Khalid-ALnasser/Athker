package com.Athker.khalid.allah

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class sbahinallah : AppCompatActivity() {
lateinit var text1:TextView
    var ny:Int=0
lateinit var re:ImageButton
  //  lateinit var progi:ProgressBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sbahinallah)
        text1=findViewById(R.id.TXTCount2)
       // progi=findViewById(R.id.progresscount)
      re=findViewById(R.id.picrefresh4)
        text1.setOnClickListener {ny++

            text1.text=(""+ny )
        }

      re.setOnClickListener {
          text1.text=""+0
      }
    }
}
