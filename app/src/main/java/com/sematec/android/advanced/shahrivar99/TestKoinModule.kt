package com.sematec.android.advanced.shahrivar99

import com.sematec.android.advanced.shahrivar99.mvvm.TestModel
import com.sematec.android.advanced.shahrivar99.mvvm.TestViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val classAModule = module {
    single { ClassA(get()) }
    single<PrintInterface> { ClassB() }

}

val viewModelModule = module {
    viewModel { TestViewModel(get()) }
    single { TestModel() }
}