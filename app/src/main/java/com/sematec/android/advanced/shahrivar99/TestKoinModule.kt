package com.sematec.android.advanced.shahrivar99

import org.koin.dsl.module

val classAModule = module {
    single { ClassA(get()) }
    single<PrintInterface> { ClassB() }
}