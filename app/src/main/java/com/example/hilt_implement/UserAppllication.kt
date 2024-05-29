package com.example.hilt_implement

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class UserAppllication:Application() {
    /** @HiltAndroidApp this annotation generated dagger code hilt start from this Application() class **/
    /** @Inject
    lateinit var userRepository: UserRepository
    //Filed Par injection
     **/

    override fun onCreate() {
        super.onCreate()
        /** userRepository.saveUser("Shivanshugupta@gmail.com","Password ") **/

    }
}