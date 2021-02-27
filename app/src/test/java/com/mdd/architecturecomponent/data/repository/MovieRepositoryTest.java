package com.mdd.architecturecomponent.data.repository;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;

import com.mdd.architecturecomponent.data.remote.RemoteDataSource;
import com.mdd.architecturecomponent.data.remote.response.Movie;
import com.mdd.architecturecomponent.utils.DataDummy;
import com.mdd.architecturecomponent.utils.LiveDataTestUtil;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.verify;

public class MovieRepositoryTest {

    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();

    private RemoteDataSource remoteDataSource = Mockito.mock(RemoteDataSource.class);
    private FakeMovieRepository fakeMovieRepository = new FakeMovieRepository(remoteDataSource);
    private List<Movie> dummyMovies = DataDummy.generateRemoteDummyMovies();
    private  Movie dummyMovie = DataDummy.generateRemoteDummyMovies().get(0);

    @Test
    public void getAllMovies() {
        doAnswer(invocation -> {
            ((RemoteDataSource.LoadResultCallback) invocation.getArguments()[0])
                    .onResultReceived(dummyMovies);
            return null;
        }).when(remoteDataSource).getAllMovies(any(RemoteDataSource.LoadResultCallback.class));

        List<Movie> movies = LiveDataTestUtil.getValue(fakeMovieRepository.getMoviesShow());
        verify(remoteDataSource).getAllMovies(any(RemoteDataSource.LoadResultCallback.class));
        assertNotNull(movies);
        assertEquals(dummyMovies.size(), movies.size());
    }

    @Test
    public void getAllTVShow() {
        doAnswer(invocation -> {
            ((RemoteDataSource.LoadResultCallback) invocation.getArguments()[0])
                    .onResultReceived(dummyMovies);
            return null;
        }).when(remoteDataSource).getAllTVShow(any(RemoteDataSource.LoadResultCallback.class));

        List<Movie> movies = LiveDataTestUtil.getValue(fakeMovieRepository.getTVShow());
        verify(remoteDataSource).getAllTVShow(any(RemoteDataSource.LoadResultCallback.class));
        assertNotNull(movies);
        assertEquals(dummyMovies.size(), movies.size());
    }

    @Test
    public void getDetailMovie(){
        Movie detailMovie = LiveDataTestUtil.getValue(fakeMovieRepository.getMovie(dummyMovie));
        assertNotNull(detailMovie);
    }

}