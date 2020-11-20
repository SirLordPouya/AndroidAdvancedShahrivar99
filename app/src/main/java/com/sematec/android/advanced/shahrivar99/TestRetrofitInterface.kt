package com.sematec.android.advanced.shahrivar99

import com.sematec.android.advanced.shahrivar99.pojo.MovieModel
import retrofit2.http.GET
import retrofit2.http.Query

interface TestRetrofitInterface {

    @GET("?apikey=70ad462a")
    suspend fun getMovies(@Query("s") title: String, @Query("page") page: Int): MovieModel
}