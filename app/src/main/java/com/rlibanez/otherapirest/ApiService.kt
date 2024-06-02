package com.rlibanez.otherapirest

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("sections")
    suspend fun getSections(@Query("start") start: String): Response<List<Section>>

}