package com.mdd.architecturecomponent.utils;

import android.annotation.SuppressLint;
import android.content.Context;

import com.mdd.architecturecomponent.data.remote.RemoteDataSource;
import com.mdd.architecturecomponent.data.remote.response.Movie;

import java.util.ArrayList;
import java.util.List;

@SuppressLint("StaticFieldLeak")
public class DataRemote {

    static Context mContext;
    static RemoteDataSource remoteDataSource = RemoteDataSource.getInstance(mContext);

    public static List<Movie> getMovieShow(Context context) {
        mContext = context;
        List<Movie> movieShow = new ArrayList<>();
        remoteDataSource.getAllMovies(movieShow::addAll);
        return movieShow;
    }

    public static List<Movie> getTVShow(Context context) {
        mContext = context;
        List<Movie> tvShow = new ArrayList<>();
        remoteDataSource.getAllTVShow(tvShow::addAll);
        return tvShow;
    }



}
