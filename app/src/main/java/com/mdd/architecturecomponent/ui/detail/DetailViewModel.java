package com.mdd.architecturecomponent.ui.detail;

import androidx.lifecycle.ViewModel;

import com.mdd.architecturecomponent.data.remote.response.Movie;
import com.mdd.architecturecomponent.data.repository.MovieRepository;

public class DetailViewModel extends ViewModel {

    private Movie movie;

    public DetailViewModel(MovieRepository movieRepository) {

    }

    public void setDetailView(Movie movie){
        this.movie = movie;
    }

    public Movie getDetailView() {
        return movie;
    }
}
