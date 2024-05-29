package com.example.hilt_implement.Moodule

import com.example.hilt_implement.firbaseRepository
import com.example.hilt_implement.sqlRepository
import com.example.hilt_implement.userRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
abstract class UserModule {
    /**  Method 1
     * @Provides
    fun providesUserRepository() : userRepository{
    return firbaseRepository()

    }**/

    /**Method -2 binds annotation vale hamesha abstract hote hai**/
    @Binds
    abstract fun providesUserRepository(sqlRepository: sqlRepository) : userRepository
}