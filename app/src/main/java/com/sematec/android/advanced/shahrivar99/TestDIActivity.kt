package com.sematec.android.advanced.shahrivar99

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.koin.android.ext.android.inject

class TestDIActivity : AppCompatActivity() {

    val aInstance: ClassA by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_d_i)

        val a = DependencyProviderClass.getNewClassAInstance()


        val aClass = DaggerDependencyComponent.create().getClassA()

    }
}