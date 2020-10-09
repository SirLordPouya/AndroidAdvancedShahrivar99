package com.sematec.android.advanced.shahrivar99

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class TestPersonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_person)

        val persons = arrayListOf(
                Person("Pouya", "Heydari", 30),
                Person("Erfan", "Akhavan", 19),
                Person("Pouya", "Karimi", 24),
                Person("Pouya", "Rahimi", 10),
                Person("Pouya", "Alipour", 11))


        //declarative
        val adults = persons
                .sortedBy { it.age }
                .filter { it.name == "Pouya" }
                .count { it.age > 18 }

        val ages = persons.map {
            it.age
        }.sorted()


        // imperative
//        for (i in 0 until persons.size) {
//            for (j in 0 until persons.size) {
//                if (j + 1 < persons.size && persons[j].age > persons[j + 1].age) {
//                    val person = persons[j]
//                    persons[j] = persons[j + 1]
//                    persons[j + 1] = person
//                }
//            }
//        }

        Log.d("TAG", "onCreate: $adults")
        Log.d("TAG", "onCreate: $ages")
        println(persons)
    }
}