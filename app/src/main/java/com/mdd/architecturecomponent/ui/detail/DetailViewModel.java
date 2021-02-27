package com.mdd.architecturecomponent.ui.detail;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.mdd.architecturecomponent.data.remote.response.Movie;
import com.mdd.architecturecomponent.data.repository.MovieRepository;

public class DetailViewModel extends ViewModel {

    private Movie movie;
    private MovieRepository movieRepository;

    public DetailViewModel(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void setDetailView(Movie movie){
        this.movie = movie;
    }

    public LiveData<Movie> getDetailMovie(){
        return movieRepository.getMovie(this.movie);
    }
}
