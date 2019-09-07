package com.Athker.khalid.allah

import android.widget.SpinnerAdapter
import com.Athker.khalid.allah.Model.Salat

interface SalatView {

    fun onDateCompleteFromAPI(Salat:Salat.Item)
    fun onDateError(throwable: Throwable)

}