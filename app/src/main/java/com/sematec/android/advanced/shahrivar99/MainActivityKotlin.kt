package com.sematec.android.advanced.shahrivar99

import android.os.Bundle
import android.widget.Toast
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


        var c: Char = family?.get(3) ?: 'c'

        print(c)
    }

    fun getHello() = "Hello"

    fun calculateAge(birthYear: Int): Int {
        return 2020 - birthYear
    }

    fun calculateUserAge(birthYear: Int) = 2020 - birthYear


    // age1 > age2  == true false
    fun compareAge(age1: Int, age2: Int) = age1 > age2


    // 1 == "One"
    fun numberToString(number: Int) = when (number) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        else -> "Unknown"
    }

    fun printHello() {
        print("Hello")
    }

    fun testIf() {
        val a = 10
        val b = 20

        //expression
        val c = if (a > b) {
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
            //
            //
            //
            true
        } else {
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
            //
            //
            //
            false
        }

    }


    fun testWhen() {
        val a = 5
        val d = when (a) {
            1 -> "One"
            2 -> {
                //
                //
                //
                "Two"
            }
            3, 4, 5 -> {
                //
                //
                "3,4,5"
            }
            else -> {
                //
                //
                "Unknown!"
            }
        }
    }

    fun testWhen2() {
        val a = 10
        val b = 20

        when {
            a > b -> {
            }
            b > a -> {
            }
            a > b && b == 0 -> {
            }
            b == a -> {
            }
            else -> {
            }
        }
    }

    fun testFor() {

        //IntRange 0..9 || 0 until 10 || 10 downTo 0
        for (id in 10 downTo 0 step 2) {
            print(id)
        }
    }

    fun testWhile() {
        while (true) {

        }
    }

    fun testForString() {
        for (i in "HelloWorld!") {
            print(i)
        }
    }

    fun testIn() {
        val name = "Pouya"
        val isOAvailable = name.contains("o")
        val isPAvailable = 'P' !in name
        val range = 0..20
        val check = 55 in range

        checkInstance(20)
        checkInstance("Qoli")
        checkInstance(false)
    }

    fun checkInstance(member: Any) = when (member){
        is String -> print(member.toUpperCase())
        is Int -> print(member + 100)
        is Boolean -> print(!member)
        else -> print("Unknown Class!")

    }


    fun testInteroperable(){
        val mainActivity = MainActivity()
    }
}