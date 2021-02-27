package com.mdd.architecturecomponent.data;

import java.io.Serializable;

public class Movie implements Serializable {

    String movieId;
    String title;
    String synopsis;
    String language;
    String production;
    String releaseYear;
    String duration;
    String cover;

    public Movie(String movieId, String title, String synopsis, String language, String production, String releaseYear, String duration, String cover) {
        this.movieId = movieId;
        this.title = title;
        this.synopsis = synopsis;
        this.language = language;
        this.production = production;
        this.releaseYear = releaseYear;
        this.duration = duration;
        this.cover = cover;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getCover() {
        return cover;
    }
}
