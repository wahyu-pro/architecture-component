package com.mdd.architecturecomponent.ui.detail;

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

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DetailViewModelTest {

    DetailViewModel viewModel;
    Movie movieDummy = DataDummy.generateRemoteDummyMovies().get(0);

    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();

    @Mock
    private MovieRepository repository;

    @Mock
    private Observer<Movie> observer;

    @Before
    public void setUp() {
        viewModel = new DetailViewModel(repository);
        viewModel.setDetailView(movieDummy);
    }

    @Test
    public void getDetailMovie() {
        MutableLiveData<Movie> movieDetail = new MutableLiveData<>();
        movieDetail.setValue(movieDummy);
        when(repository.getMovie(movieDummy)).thenReturn(movieDetail);
        Movie detailMovie = viewModel.getDetailMovie().getValue();
        verify(repository).getMovie(movieDummy);
        assertNotNull(detailMovie);
        assertEquals(movieDummy.getTitle(), detailMovie.getTitle());
        assertEquals(movieDummy.getPosterPath(), detailMovie.getPosterPath());
        assertEquals(movieDummy.getOverview(), detailMovie.getOverview());
        assertEquals(movieDummy.getFirstAirDate(), detailMovie.getFirstAirDate());
        assertEquals(movieDummy.getBackdropPath(), detailMovie.getBackdropPath());
        assertEquals(movieDummy.getName(), detailMovie.getName());
        assertEquals(movieDummy.getOriginalLanguage(), detailMovie.getOriginalLanguage());
        assertEquals(movieDummy.getId(), detailMovie.getId());
        assertEquals(movieDummy.getReleaseDate(), detailMovie.getReleaseDate());

        viewModel.getDetailMovie().observeForever(observer);
        verify(observer).onChanged(movieDummy);

    }

}