package com.sematec.android.advanced.shahrivar99

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@BaseApplication)
            // declare modules
            modules(classAModule, viewModelModule)
        }
    }
}