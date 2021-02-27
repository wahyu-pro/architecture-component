package com.mdd.architecturecomponent.ui.movies;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import com.mdd.architecturecomponent.data.remote.response.Movie;
import com.mdd.architecturecomponent.data.repository.MovieRepository;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class MoviesViewModelTest {

    MoviesViewModel viewModel;

    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();

    @Mock
    private MovieRepository repository;

    @Mock
    private Observer<List<Movie>> observer;

    @Before
    public void setUp() {
        viewModel = new MoviesViewModel(repository);
    }

    @Test
    public void getAllMovies(){
        MutableLiveData<Movie> movies = new MutableLiveData<>();

    }

}