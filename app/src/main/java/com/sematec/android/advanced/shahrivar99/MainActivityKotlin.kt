package com.sematec.android.advanced.shahrivar99

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivityKotlin : AppCompatActivity() {

    // var : variable
    // val : value


    // non-nullable variables
    // nullable variables

    // int age = 30;
    var age = 30 // Int
    val age1: Int = 3065165 // Int
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


        printData("Pouya", "Heydari", 30, true, "")
        printData("Pouya", "Heydari", 30, true, "")
        printData("Pouya", "Heydari", 30, true, "")
        printData("Pouya", "Heydari", 30, true, "")
        printData("Pouya", "Heydari", 30, true, "")
        printData("Pouya", "Heydari", 30, true, "")
        printData("Pouya", "Heydari", 30, true, "")
        printData("Pouya", "Heydari", 30, true, "")
        printData("Pouya", "Heydari", 30, true, "")
        printData("Pouya", "Heydari", 30, true, "")
        printData("Pouya", "Heydari", 30, true, "")
        printData("Pouya", "Heydari", 30, true, "")
        printData("Pouya", "Heydari")
        printData(age = 30, name = "Pouya", isMale = true, family = "Heydari", fatherName = "")
        printData("Pouya", "Heydari", 35, false, "")


        // lambda || high order functions
        val lambdaFunction: (Int) -> Int = { age -> 2020 - age }

        val userAge = lambdaFunction(1980)

        val userAge2 = calculateAgeByShamsiYear { 2020 - it }


        val concatMessage: (String, String, Boolean) -> String = { name, family, isMale ->
            if (isMale) "Mr. $name $family" else "Ms. $name $family"
        }

        salute("Pouya", "Heydari", true, concatMessage)

        txtHello.text = age1.toPersianNumber()


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
        val range: IntRange = 0..20
        val check = 55 in range

        checkInstance(20)
        checkInstance("Qoli")
        checkInstance(false)
    }

    fun checkInstance(member: Any) = when (member) {
        is String -> print(member.toUpperCase())
        is Int -> print(member + 100)
        is Boolean -> print(!member)
        else -> print("Unknown Class!")

    }

    fun printData(name: String, family: String, age: Int = 30, isMale: Boolean = true, fatherName: String = "") {
        print(name + family + age + isMale + fatherName)
    }


    fun testInteroperable() {
        val mainActivity = MainActivity()
    }

    // Extension Function
//    fun toPersianNumber(number: Int): String {
//
//    }

    fun Int.toPersianNumber(): String {
        val originalNumber = this.toString()
        var newNumber = originalNumber.replace("1", "۱")
        newNumber = newNumber.replace("2", "۲")
        newNumber = newNumber.replace("3", "۳")
        newNumber = newNumber.replace("4", "۴")
        newNumber = newNumber.replace("5", "۵")
        newNumber = newNumber.replace("6", "۶")
        newNumber = newNumber.replace("7", "۷")
        newNumber = newNumber.replace("8", "۸")
        newNumber = newNumber.replace("9", "۹")
        newNumber = newNumber.replace("0", "۰")
        return newNumber
    }


    /**
     * High Order Function
     *
     * @param shamsi
     * @param calculateAge
     * @return
     */
    fun calculateAgeByShamsiYear(calculateAge: (Int) -> Int): Int {
        // turn shamsi to gregorian date

        return calculateAge(1980)
    }

    fun salute(name: String, family: String, isMale: Boolean, concatMessage: (String, String, Boolean) -> String): String {
        return concatMessage(name, family, isMale)
    }


    fun testDestruct() {
        val pair = "Name" to "Pouya"
        val (key,value) = pair
    }
}