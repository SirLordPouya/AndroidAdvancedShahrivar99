package com.sematec.android.advanced.shahrivar99.mvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sematec.android.advanced.shahrivar99.R
import kotlinx.android.synthetic.main.activity_test_m_v_v_m.*
import org.koin.android.viewmodel.ext.android.viewModel

class TestMVVMActivity : AppCompatActivity() {

    private val viewModel: TestViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_m_v_v_m)

        viewModel.personLiveData.observe(this, {

        })

        btnFetchUsers.setOnClickListener {
            viewModel.getUsers()
        }
    }
}