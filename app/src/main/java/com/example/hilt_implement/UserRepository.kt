package com.example.hilt_implement

import android.util.Log
import javax.inject.Inject


interface userRepository{
    fun  saveUser(email:String,password: String)
}
class sqlRepository @Inject constructor():userRepository {
    override fun saveUser(email:String, password:String){
        Log.w("SQLREPOSITORY","Data is saved by $email")
    }
}

class firbaseRepository @Inject constructor():userRepository {
    override fun saveUser(email:String, password:String){
        Log.w("FireBaseREPOSITORY","Data is saved by $email")
    }
}