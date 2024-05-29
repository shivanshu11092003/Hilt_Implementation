package com.example.hilt_implement

import android.util.Log
import javax.inject.Inject

class LoggerService @Inject constructor() {
    fun Logger(message:String){
        Log.w("Logger Service Save User", message)
    }
}