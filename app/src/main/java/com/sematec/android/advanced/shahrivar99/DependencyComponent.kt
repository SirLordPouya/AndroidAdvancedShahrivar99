package com.sematec.android.advanced.shahrivar99

import dagger.Component

@Component(modules = [DependencyModule::class])
interface DependencyComponent {

    fun getClassA(): ClassA
}