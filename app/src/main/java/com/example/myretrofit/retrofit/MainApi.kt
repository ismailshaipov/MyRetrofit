package com.example.myretrofit.retrofit

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface MainApi {
    @GET("products/1")
    suspend fun getProduct(): Product

    @POST("auth/login")
    suspend fun auth(@Body authRequest: AuthRequest): User
}