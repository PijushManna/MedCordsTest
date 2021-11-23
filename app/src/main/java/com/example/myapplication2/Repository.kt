package com.example.myapplication2

import com.squareup.moshi.KotlinJsonAdapterFactory
import com.squareup.moshi.Moshi
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET


private val moshe = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

const val BASE_URL = "https://qa-ops.medcords.com/mhc/"
private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshe))
    .baseUrl(BASE_URL)
    .build()

interface NetworkApis{
        @GET("test_handle_click")
        fun getData():Call<MedCord>
}

object NetworkApi{
    val getNetworkData : NetworkApis by lazy {
        retrofit.create(NetworkApis::class.java)
    }
}
