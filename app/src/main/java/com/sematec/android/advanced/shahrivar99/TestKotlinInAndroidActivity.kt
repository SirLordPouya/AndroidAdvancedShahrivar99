package com.sematec.android.advanced.shahrivar99

import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import kotlinx.android.synthetic.main.activity_test_kotlin_in_android.*

class TestKotlinInAndroidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_kotlin_in_android)

        val names = MutableLiveData<String>()


        names.observe(this, {
            Log.d("TAG", "onCreate: $it")
        })


        names.postValue("Pouya")
        names.postValue("Erfan")

        btnOk.setText("")
        btnOk.getText()


        btnOk.text = ""
        btnOk.text


        //anonymous class/object
        btnOk.setOnClickListener {
            Toast.makeText(this, "asd", Toast.LENGTH_SHORT).show()
        }


        // 1.4
        btnOk.setOnFocusChangeListener { _, _ ->

        }


        //SAM Interface ======> Lambda
        btnOk.setOnClickListener {
            Toast.makeText(this@TestKotlinInAndroidActivity, "", Toast.LENGTH_LONG).show()
        }

        Handler().postDelayed({

        }, 500)

    }
}