package com.mdd.architecturecomponent.data;

import com.mdd.architecturecomponent.data.remote.RemoteDataSource;
import com.mdd.architecturecomponent.data.repository.MovieRepository;

public class Injection {


    public static MovieRepository provideRepository() {

        RemoteDataSource remoteDataSource = RemoteDataSource.getInstance();

        return MovieRepository.getInstance(remoteDataSource);
    }


}
