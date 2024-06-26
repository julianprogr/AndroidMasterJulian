package com.example.androidmaster.superheroapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("/api/a188dda7bbc5a38f46dc120851a6323d/search/{name}")
    suspend fun getSuperheroes(@Path("name") superheroName:String):Response<SuperHeroDataResponse>

    @GET("/api/a188dda7bbc5a38f46dc120851a6323d/{id}")
    suspend fun getSuperheroesDetail(@Path("id") superheroName:String):Response<SuperHeroDetailResponse>

}