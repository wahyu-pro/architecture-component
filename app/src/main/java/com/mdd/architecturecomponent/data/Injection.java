package com.mdd.architecturecomponent.data;

import android.content.Context;

import com.mdd.architecturecomponent.data.remote.RemoteDataSource;
import com.mdd.architecturecomponent.data.repository.MovieRepository;

public class Injection {


    public static MovieRepository provideRepository(Context context) {

        RemoteDataSource remoteDataSource = RemoteDataSource.getInstance(context);

        return MovieRepository.getInstance(remoteDataSource);
    }


}
