package com.mdd.architecturecomponent.ui.movies;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import com.mdd.architecturecomponent.data.remote.response.Movie;
import com.mdd.architecturecomponent.data.repository.MovieRepository;
import com.mdd.architecturecomponent.utils.DataDummy;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
        List<Movie> dummyMovies = DataDummy.generateRemoteDummyMovies();
        MutableLiveData<List<Movie>> movies = new MutableLiveData<>();
        movies.setValue(dummyMovies);
        when(repository.getMoviesShow()).thenReturn(movies);
        List<Movie> movie = viewModel.getMovies().getValue();
        verify(repository).getMoviesShow();
        assertNotNull(movie);
        assertEquals(10, movie.size());

        viewModel.getMovies().observeForever(observer);
        verify(observer).onChanged(dummyMovies);

    }

}