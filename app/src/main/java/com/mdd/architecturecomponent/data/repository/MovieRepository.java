package com.mdd.architecturecomponent.data.repository;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.mdd.architecturecomponent.data.remote.RemoteDataSource;
import com.mdd.architecturecomponent.data.remote.response.Movie;

import java.util.List;

public class MovieRepository implements IMovieRepository{

    private volatile static MovieRepository INSTANCE = null;
    private final RemoteDataSource remoteDataSource;
    private MovieRepository(@NonNull RemoteDataSource remoteDataSource) {
        this.remoteDataSource = remoteDataSource;
    }
    public static MovieRepository getInstance(RemoteDataSource remoteData) {
        if (INSTANCE == null) {
            synchronized (MovieRepository.class) {
                if (INSTANCE == null) {
                    INSTANCE = new MovieRepository(remoteData);
                }
            }
        }
        return INSTANCE;
    }


    @Override
    public LiveData<List<Movie>> getMoviesShow() {
        MutableLiveData<List<Movie>> movieShow = new MutableLiveData<>();
        remoteDataSource.getAllMovies(movieShow::postValue);
        return movieShow;
    }

    @Override
    public LiveData<List<Movie>> getTVShow() {
        MutableLiveData<List<Movie>> tvShow = new MutableLiveData<>();
        remoteDataSource.getAllTVShow(tvShow::postValue);
        return tvShow;
    }

}
