package com.mdd.architecturecomponent.data.remote;

import com.mdd.architecturecomponent.BuildConfig;
import com.mdd.architecturecomponent.data.remote.response.Movie;
import com.mdd.architecturecomponent.data.remote.response.MovieResponse;
import com.mdd.architecturecomponent.service.ApiClient;
import com.mdd.architecturecomponent.service.ApiService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RemoteDataSource {

    private static RemoteDataSource INSTANCE;

    public static RemoteDataSource getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new RemoteDataSource();
        }
        return INSTANCE;
    }


    public void getAllMovies(LoadResultCallback callback) {
        ApiClient.client(ApiService.class).getMovie(BuildConfig.API_KEY)
                .enqueue(new Callback<MovieResponse>() {
                    @Override
                    public void onResponse(Call<MovieResponse> call, Response<MovieResponse> response) {
                        if (response.body() != null) {
                            callback.onResultReceived(response.body().getResults());
                        }
                    }

                    @Override
                    public void onFailure(Call<MovieResponse> call, Throwable t) {

                    }
                });
    }

    public void getAllTVShow(LoadResultCallback callback) {
        ApiClient.client(ApiService.class).getTvShow(BuildConfig.API_KEY)
                .enqueue(new Callback<MovieResponse>() {
                    @Override
                    public void onResponse(Call<MovieResponse> call, Response<MovieResponse> response) {
                        if (response.body() != null) {
                            callback.onResultReceived(response.body().getResults());
                        }
                    }

                    @Override
                    public void onFailure(Call<MovieResponse> call, Throwable t) {

                    }
                });
    }


    public interface LoadResultCallback {
        void onResultReceived(List<Movie> response);
    }

}
