package com.Athker.khalid.allah

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomSheetDialog
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import android.widget.Button
import kotlinx.android.synthetic.main.activity_addtsbah.view.*
import kotlinx.android.synthetic.main.activity_alhmedlallah.view.*
import kotlinx.android.synthetic.main.activity_allah_akber.*
import kotlinx.android.synthetic.main.activity_allah_akber.view.*
import kotlinx.android.synthetic.main.activity_allah_akber.view.picrefofresh3
import kotlinx.android.synthetic.main.activity_lailahaallah.view.*
import kotlinx.android.synthetic.main.activity_mohammed.view.*
import kotlinx.android.synthetic.main.activity_mohammed.view.TXTCount6
import kotlinx.android.synthetic.main.activity_newtsbah.view.*
import kotlinx.android.synthetic.main.activity_sbahinallah.view.*
import kotlinx.android.synthetic.main.activity_stgfarallah.view.*
import kotlinx.android.synthetic.main.activity_stgfarallah.view.TXTCount1
import com.Athker.khalid.allah.R.id.btncs13 as btncs13

class counter : AppCompatActivity() {

    var cou:Int=0
    var cou1:Int=0
    var cou2:Int=0
    var cou3:Int=0
    var cou4:Int=0
    var cou5:Int=0
    var cou6:Int=0
    var cou7:Int=0
    var o:Int=10
var color1:Boolean=true

    var rest:Boolean=true
    lateinit var btsc1:Button
    lateinit var btsc2:Button
    lateinit var btsc3:Button
    lateinit var btsc4:Button
    lateinit var btsc5:Button
    lateinit var btsc6:Button
    lateinit var btsc7:Button
    lateinit var btsc8:Button


    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)
        btsc1 = findViewById(R.id.btns1)
        btsc2 = findViewById(R.id.btns2)
        btsc3 = findViewById(R.id.btns3)
        btsc4 = findViewById(R.id.btns4)
        btsc5 = findViewById(R.id.btns5)
        btsc6 = findViewById(R.id.btns6)
        btsc7 = findViewById(R.id.lsss17)


        btsc1.setOnClickListener {

            val dialog2 = BottomSheetDialog(this)
            val View2 = layoutInflater.inflate(R.layout.activity_stgfarallah, null)
            dialog2.setContentView(View2)
            dialog2.show()
            View2.btncs1.setOnClickListener {
                cou++

                View2.TXTCount1.text = "" + cou





            }
            View2.picrefresh1.setOnClickListener {
                View2.TXTCount1.text = "0"
                if (rest) {
                    this.cou = 0
                }


            }

        }

        btsc2.setOnClickListener {

            val dialog1 = BottomSheetDialog(this)
            val View1 = layoutInflater.inflate(R.layout.activity_sbahinallah, null)
            dialog1.setContentView(View1)
            dialog1.show()
            View1.btncs.setOnClickListener {
                cou1++

                View1.TXTCopunt.text = "" + cou1

            }
            View1.picrepfresh.setOnClickListener {
                View1.TXTCopunt.text = "0"

                if (rest) {
                    this.cou1 = 0
                }

            }
        }

        btsc3.setOnClickListener {

            val dialog3 = BottomSheetDialog(this)
            val View3 = layoutInflater.inflate(R.layout.activity_alhmedlallah, null)
            dialog3.setContentView(View3)
            dialog3.show()
            View3.btncs2.setOnClickListener {
                cou2++
                View3.TXTCount2.text = "" + cou2


            }
            View3.picrefresh2.setOnClickListener {
                View3.TXTCount2.text = "0"

                if (rest) {
                    this.cou2 = 0
                }

            }

        }




        btsc4.setOnClickListener {

            val dialog4 = BottomSheetDialog(this)
            val View4 = layoutInflater.inflate(R.layout.activity_allah_akber, null)
            dialog4.setContentView(View4)
            dialog4.show()
            View4.btncs3.setOnClickListener {
                cou3++
                View4.TXTCorunt3.text = "" + cou3




            }
            View4.picrefofresh3.setOnClickListener {
                View4.TXTCorunt3.text = "0"

                if (rest) {
                    this.cou3 = 0
                }

            }
        }
        btsc5.setOnClickListener {

            val dialog5 = BottomSheetDialog(this)
            val View5 = layoutInflater.inflate(R.layout.activity_lailahaallah, null)
            dialog5.setContentView(View5)
            dialog5.show()
            View5.btncs4.setOnClickListener {
                cou4++
                View5.TXTCount4.text = "" + cou4
            }
            View5.picrefresh4.setOnClickListener {
                View5.TXTCount4.text = "0"

                if (rest) {
                    this.cou4 = 0
                }

            }
        }
        btsc6.setOnClickListener {

            val dialog6 = BottomSheetDialog(this)
            val View6 = layoutInflater.inflate(R.layout.activity_mohammed, null)
            dialog6.setContentView(View6)
            dialog6.show()
            View6.btncs6.setOnClickListener {
                cou5++

                View6.TXTCount6.text = "" + cou5


            }
            View6.picrefresh6.setOnClickListener {
                View6.TXTCount6.text = "0"

                if (rest) {
                    this.cou5 = 0
                }

            }
        }

        btsc7.setOnClickListener {

            val artdilog=LayoutInflater.from(this).inflate(R.layout.activity_addtsbah,null)
            val atrdi=AlertDialog.Builder(this)
                    .setView(artdilog)
                    .setTitle("أضف تسبيحة جديدة")



            val mAlertDialog=atrdi.show()

            artdilog.btnnewtsbah1.setOnClickListener {
                mAlertDialog.dismiss()

            }
            artdilog.btnnewtsbah.setOnClickListener {
                mAlertDialog.dismiss()

                val dialog9 = BottomSheetDialog(this)
                val View9 = layoutInflater.inflate(R.layout.activity_newtsbah, null)
                dialog9.setContentView(View9)
                dialog9.show()
                val name=artdilog.texttsnah.text.toString()

                View9.btncs13.setText(""+name)
                View9.btncs13.setOnClickListener {
                    cou7++

                    View9.TXTCorunt13.text = "" + cou7


                }
                View9.picrefofresh3.setOnClickListener {
                    View9.TXTCorunt13.text = "0"

                    if (rest) {
                        this.cou7 = 0
                    }

                }
            }
        }
    }
    }



