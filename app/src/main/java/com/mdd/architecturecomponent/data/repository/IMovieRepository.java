package com.mdd.architecturecomponent.data.repository;

import androidx.lifecycle.LiveData;

import com.mdd.architecturecomponent.data.remote.response.Movie;

import java.util.List;

public interface IMovieRepository {

    LiveData<List<Movie>> getMoviesShow();
    LiveData<List<Movie>> getTVShow();
    LiveData<Movie> getMovie(Movie movie);
}
