package com.sematec.android.advanced.shahrivar99.testrx

class ObserverClass {

    fun observe() {
        val observable = ObservableClass().getObservable()
        observable.subscribe({

        },{

        },{

        })
    }
}