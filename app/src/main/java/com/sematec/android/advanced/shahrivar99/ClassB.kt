package com.sematec.android.advanced.shahrivar99

import javax.inject.Inject

class ClassB @Inject constructor() : PrintInterface {

    override fun printName(name: String) {
        print(name)
    }
}