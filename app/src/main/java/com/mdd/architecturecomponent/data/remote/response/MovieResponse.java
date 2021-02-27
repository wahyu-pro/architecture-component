package com.mdd.architecturecomponent.data.remote.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieResponse{
	@SerializedName("results")
	private List<Movie> results;

	public List<Movie> getResults(){
		return results;
	}
}