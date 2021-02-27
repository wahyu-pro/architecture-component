package com.mdd.architecturecomponent.ui.movies;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.mdd.architecturecomponent.data.remote.response.Movie;
import com.mdd.architecturecomponent.data.repository.MovieRepository;

import java.util.List;

public class MoviesViewModel extends ViewModel {

    private MovieRepository movieRepository;

    public MoviesViewModel(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public LiveData<List<Movie>> getMovies(){
        return movieRepository.getMoviesShow();
    }

}
