package com.sematec.android.advanced.shahrivar99

import dagger.Module
import dagger.Provides

@Module
class DependencyModule {

    @Provides
    fun providePrint(): PrintInterface{
        return ClassB()
    }
}