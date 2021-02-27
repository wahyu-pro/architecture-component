package com.mdd.architecturecomponent;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.contrib.RecyclerViewActions;

import com.mdd.architecturecomponent.data.Movie;
import com.mdd.architecturecomponent.ui.home.HomeActivity;
import com.mdd.architecturecomponent.utils.DataDummy;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class HomeActivityTest {

    List<Movie> dataDummy = DataDummy.generateDummyMovies();

    @Before
    public void setup(){
        ActivityScenario.launch(HomeActivity.class);
    }

    @Test
    public void loadMovies() {
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()));
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition(dataDummy.size()));
    }

    @Test
    public void loadDetailMovie(){
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));
        onView(withId(R.id.iv_cover)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_title)).check(matches(isDisplayed()));
        onView(withId(R.id.language)).check(matches(isDisplayed()));
        onView(withId(R.id.duration)).check(matches(isDisplayed()));
        onView(withId(R.id.production)).check(matches(isDisplayed()));
        onView(withId(R.id.synopsis)).check(matches(isDisplayed()));
        onView(withId(R.id.year)).check(matches(isDisplayed()));


        onView(withId(R.id.tv_title)).check(matches(withText(dataDummy.get(0).getTitle())));
        onView(withId(R.id.language)).check(matches(withText(dataDummy.get(0).getLanguage())));
        onView(withId(R.id.duration)).check(matches(withText(dataDummy.get(0).getDuration())));
        onView(withId(R.id.synopsis)).check(matches(withText(dataDummy.get(0).getSynopsis())));
        onView(withId(R.id.year)).check(matches(withText(dataDummy.get(0).getReleaseYear())));
    }

    @Test
    public void loadTvShow() {
        onView(withText("TV SHOW")).perform(click());
        onView(withId(R.id.rv_tvshow)).check(matches(isDisplayed()));
        onView(withId(R.id.rv_tvshow)).perform(RecyclerViewActions.scrollToPosition(dataDummy.size()));
    }


    @Test
    public void loadDetailTVShow(){
        onView(withText("TV SHOW")).perform(click());
        onView(withId(R.id.rv_tvshow)).perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));
        onView(withId(R.id.iv_cover)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_title)).check(matches(isDisplayed()));
        onView(withId(R.id.language)).check(matches(isDisplayed()));
        onView(withId(R.id.duration)).check(matches(isDisplayed()));
        onView(withId(R.id.production)).check(matches(isDisplayed()));
        onView(withId(R.id.synopsis)).check(matches(isDisplayed()));
        onView(withId(R.id.year)).check(matches(isDisplayed()));


        onView(withId(R.id.tv_title)).check(matches(withText(dataDummy.get(0).getTitle())));
        onView(withId(R.id.language)).check(matches(withText(dataDummy.get(0).getLanguage())));
        onView(withId(R.id.duration)).check(matches(withText(dataDummy.get(0).getDuration())));
        onView(withId(R.id.synopsis)).check(matches(withText(dataDummy.get(0).getSynopsis())));
        onView(withId(R.id.year)).check(matches(withText(dataDummy.get(0).getReleaseYear())));
    }
}