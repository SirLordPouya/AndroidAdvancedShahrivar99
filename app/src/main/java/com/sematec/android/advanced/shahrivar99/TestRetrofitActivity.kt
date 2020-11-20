package com.sematec.android.advanced.shahrivar99

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.sematec.android.advanced.shahrivar99.pojo.Search
import kotlinx.android.synthetic.main.activity_test_retrofit.*
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class TestRetrofitActivity : AppCompatActivity() {

    private val movies = arrayListOf<Search>()
    var page = 0
    lateinit var adapter: MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_retrofit)

        setUpAdapter()

        val retrofit = Retrofit.Builder()
                .baseUrl("https://www.omdbapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        val retrofitInterface = retrofit.create(TestRetrofitInterface::class.java)

        fabNextPage.setOnClickListener {
            page += 1
            lifecycleScope.launch {
                val response = retrofitInterface.getMovies("gladiator", page)
                movies.addAll(response.search)
                adapter.submitList(movies.toMutableList())
            }
        }
    }

    private fun setUpAdapter() {
        adapter = MovieAdapter()
        recycler.adapter = adapter
    }

}