package com.sematec.android.advanced.shahrivar99.testrx

import io.reactivex.rxjava3.core.Observable

class ObservableClass {

    fun getObservable(): Observable<String> {
       return Observable.just("Pouya Heydari","Masoomeh Rahimi", "Karimi")
    }
}