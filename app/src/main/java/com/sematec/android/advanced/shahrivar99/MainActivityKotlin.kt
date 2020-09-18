package com.sematec.android.advanced.shahrivar99

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivityKotlin : AppCompatActivity() {

    // var : variable
    // val : value


    // non-nullable variables
    // nullable variables

    // int age = 30;
    var age = 30 // Int
    val age1: Int = 30 // Int
    val height = 33.3 // Double
    var isMale: Boolean = false
    var name = "Pouya"
    var family: String? = null
    lateinit var fatherName: String
    val str = String()
    val list = ArrayList<String>()
    var a = null // Any?


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        age1 = 20
        age = 40

        // webservice
        fatherName = ""


        //
        family!!.get(3)


       var c:Char = family?.get(3) ?: 'c'

      print(c)
    }

    fun getHello(): String {
        return "Hello"
    }

    fun calculateAge(birthYear: Int): Int {
        return 2020 - birthYear
    }

    fun calculateUserAge(birthYear: Int): Int {
        return 2020 - birthYear
    }

    fun printHello() {
        print("Hello")
    }
}