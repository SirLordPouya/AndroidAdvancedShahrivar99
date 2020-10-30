package com.sematec.android.advanced.shahrivar99

import javax.inject.Inject

//Constructor injection
class ClassA @Inject constructor(val dependency: PrintInterface) {


    fun getAndPrintName() {
        // get the name

        val name = "Pouya"
        dependency.printName(name)
    }
}