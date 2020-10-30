package com.sematec.android.advanced.shahrivar99

class DependencyProviderClass {


    companion object {
        fun getNewClassAInstance(): ClassA = ClassA(ClassB())
    }
}