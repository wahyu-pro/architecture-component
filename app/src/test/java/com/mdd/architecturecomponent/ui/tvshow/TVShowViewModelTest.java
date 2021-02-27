package com.mdd.architecturecomponent.ui.tvshow;

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
public class TVShowViewModelTest {

    TVShowViewModel viewModel;

    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();

    @Mock
    private MovieRepository repository;

    @Mock
    private Observer<List<Movie>> observer;

    @Before
    public void setUp() {
        viewModel = new TVShowViewModel(repository);
    }

    @Test
    public void getAllTVShow(){
        List<Movie> dummyMovies = DataDummy.generateRemoteDummyMovies();
        MutableLiveData<List<Movie>> movies = new MutableLiveData<>();
        movies.setValue(dummyMovies);
        when(repository.getTVShow()).thenReturn(movies);
        List<Movie> movie = viewModel.getTvShowMovies().getValue();
        verify(repository).getTVShow();
        assertNotNull(movie);
        assertEquals(10, movie.size());

        viewModel.getTvShowMovies().observeForever(observer);
        verify(observer).onChanged(dummyMovies);

    }

}