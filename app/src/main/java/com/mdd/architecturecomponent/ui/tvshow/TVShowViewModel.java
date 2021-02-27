package com.mdd.architecturecomponent.ui.tvshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.mdd.architecturecomponent.data.remote.response.Movie;
import com.mdd.architecturecomponent.data.repository.MovieRepository;
import com.mdd.architecturecomponent.utils.DataDummy;

import java.util.List;

public class TVShowViewModel extends ViewModel {

    private MovieRepository movieRepository;

    public TVShowViewModel(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public LiveData<List<Movie>> getTvShowMovies(){
        return movieRepository.getTVShow();
    }

}
