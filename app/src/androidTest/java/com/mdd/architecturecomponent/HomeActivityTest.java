package com.mdd.architecturecomponent;

import android.content.Context;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.IdlingRegistry;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.platform.app.InstrumentationRegistry;

import com.mdd.architecturecomponent.data.remote.response.Movie;
import com.mdd.architecturecomponent.ui.home.HomeActivity;
import com.mdd.architecturecomponent.utils.DataRemote;
import com.mdd.architecturecomponent.utils.EspressoIdlingResource;

import org.junit.After;
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

    Context context = InstrumentationRegistry.getInstrumentation().getContext();
    List<Movie> movieShow = DataRemote.getMovieShow(context);
    List<Movie> tvShow = DataRemote.getTVShow(context);

    @Before
    public void setup(){
        ActivityScenario.launch(HomeActivity.class);
        IdlingRegistry.getInstance().register(EspressoIdlingResource.getEspressoIdlingResource());
    }

    @After
    public void tearDown() {
        IdlingRegistry.getInstance().unregister(EspressoIdlingResource.getEspressoIdlingResource());
    }

    @Test
    public void loadMovies() {
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()));
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition(movieShow.size()));
    }

    @Test
    public void loadDetailMovie(){
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));
        onView(withId(R.id.iv_cover)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_title)).check(matches(isDisplayed()));
        onView(withId(R.id.language)).check(matches(isDisplayed()));
        onView(withId(R.id.synopsis)).check(matches(isDisplayed()));
        onView(withId(R.id.year)).check(matches(isDisplayed()));

        onView(withId(R.id.tv_title)).check(matches(withText(movieShow.get(0).getTitle())));
        onView(withId(R.id.language)).check(matches(withText(movieShow.get(0).getOriginalLanguage().toUpperCase())));
        onView(withId(R.id.synopsis)).check(matches(withText(movieShow.get(0).getOverview())));
        onView(withId(R.id.year)).check(matches(withText(movieShow.get(0).getReleaseDate())));
    }

    @Test
    public void loadTvShow() {
        onView(withText("TV SHOW")).perform(click());
        onView(withId(R.id.rv_tvshow)).check(matches(isDisplayed()));
        onView(withId(R.id.rv_tvshow)).perform(RecyclerViewActions.scrollToPosition(tvShow.size()));
    }


    @Test
    public void loadDetailTVShow(){
        onView(withText("TV SHOW")).perform(click());
        onView(withId(R.id.rv_tvshow)).perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));
        onView(withId(R.id.iv_cover)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_title)).check(matches(isDisplayed()));
        onView(withId(R.id.language)).check(matches(isDisplayed()));
        onView(withId(R.id.synopsis)).check(matches(isDisplayed()));
        onView(withId(R.id.year)).check(matches(isDisplayed()));

        onView(withId(R.id.tv_title)).check(matches(withText(tvShow.get(0).getName())));
        onView(withId(R.id.language)).check(matches(withText(tvShow.get(0).getOriginalLanguage().toUpperCase())));
        onView(withId(R.id.synopsis)).check(matches(withText(tvShow.get(0).getOverview())));
        onView(withId(R.id.year)).check(matches(withText(tvShow.get(0).getFirstAirDate())));
    }
}