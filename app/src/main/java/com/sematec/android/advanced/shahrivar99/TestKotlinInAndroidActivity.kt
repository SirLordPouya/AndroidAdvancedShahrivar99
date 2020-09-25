package com.sematec.android.advanced.shahrivar99

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_test_kotlin_in_android.*

class TestKotlinInAndroidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_kotlin_in_android)

        btnOk.setText("")
        btnOk.getText()


        btnOk.text = ""
        btnOk.text


        //anonymous class/object
        btnOk.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                //
                //
            }
        })

        btnOk.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Toast.makeText(this@TestKotlinInAndroidActivity,"",Toast.LENGTH_LONG).show()
            }
        })

        Handler().postDelayed(object : Runnable{
            override fun run() {
                //
                //
                //
            }
        },500)

    }
}