package com.sematec.android.advanced.shahrivar99

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TestReactiveProgramming : AppCompatActivity() {
    val list = ArrayList<Int>()
    val list2 = ArrayList<Int>()


    fun checkListOperations() {
        list.forEach {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        }
        val data = list[1]
        list[1] = 10

        list.add(2)
        list.addAll(list2)
        list.lastOrNull()
        val a = list.all { it > 20 }
        list.getOrNull(5)

    }
}