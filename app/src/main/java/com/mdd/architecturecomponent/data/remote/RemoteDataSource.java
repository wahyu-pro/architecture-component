package com.mdd.architecturecomponent.data.remote;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Toast;

import com.mdd.architecturecomponent.BuildConfig;
import com.mdd.architecturecomponent.data.remote.response.Movie;
import com.mdd.architecturecomponent.data.remote.response.MovieResponse;
import com.mdd.architecturecomponent.service.ApiClient;
import com.mdd.architecturecomponent.service.ApiService;
import com.mdd.architecturecomponent.utils.EspressoIdlingResource;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RemoteDataSource {

    @SuppressLint("StaticFieldLeak")
    private static RemoteDataSource INSTANCE;

    private Context context;

    private RemoteDataSource (Context context){
        this.context = context;
    }

    public static RemoteDataSource getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new RemoteDataSource(context);
        }
        return INSTANCE;
    }


    public void getAllMovies(LoadResultCallback callback) {
        EspressoIdlingResource.increment();
        ApiClient.client(ApiService.class).getMovie(BuildConfig.API_KEY)
                .enqueue(new Callback<MovieResponse>() {
                    @Override
                    public void onResponse(Call<MovieResponse> call, Response<MovieResponse> response) {
                        EspressoIdlingResource.decrement();
                        if (response.body() != null) {
                            callback.onResultReceived(response.body().getResults());
                        }
                    }

                    @Override
                    public void onFailure(Call<MovieResponse> call, Throwable t) {
                        EspressoIdlingResource.decrement();
                        Toast.makeText(context, "Failed "+t.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });
    }

    public void getAllTVShow(LoadResultCallback callback) {
        EspressoIdlingResource.increment();
        ApiClient.client(ApiService.class).getTvShow(BuildConfig.API_KEY)
                .enqueue(new Callback<MovieResponse>() {
                    @Override
                    public void onResponse(Call<MovieResponse> call, Response<MovieResponse> response) {
                        EspressoIdlingResource.decrement();
                        if (response.body() != null) {
                            callback.onResultReceived(response.body().getResults());
                        }
                    }

                    @Override
                    public void onFailure(Call<MovieResponse> call, Throwable t) {
                        EspressoIdlingResource.decrement();
                        Toast.makeText(context, "Failed "+t.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });
    }


    public interface LoadResultCallback {
        void onResultReceived(List<Movie> response);
    }

}
