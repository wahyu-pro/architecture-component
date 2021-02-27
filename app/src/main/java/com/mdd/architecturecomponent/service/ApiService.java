package com.mdd.architecturecomponent.service;


import com.mdd.architecturecomponent.data.remote.response.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("movie/popular")
    Call<MovieResponse> getMovie(@Query("api_key") String apiKey);

    @GET("tv/popular")
    Call<MovieResponse> getTvShow(@Query("api_key") String ApiKey);

}
