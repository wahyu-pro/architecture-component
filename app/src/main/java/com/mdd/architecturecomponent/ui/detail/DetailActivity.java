package com.mdd.architecturecomponent.ui.detail;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.mdd.architecturecomponent.R;
import com.mdd.architecturecomponent.data.ViewModelFactory;
import com.mdd.architecturecomponent.data.remote.response.Movie;
import com.mdd.architecturecomponent.databinding.ActivityDetailBinding;
import com.mdd.architecturecomponent.databinding.ContentDetailBinding;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_MOVIE = "extra_movie";
    ContentDetailBinding detailBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetailBinding activityDetailBinding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(activityDetailBinding.getRoot());
        detailBinding = activityDetailBinding.detailContent;

        setSupportActionBar(activityDetailBinding.toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ViewModelFactory factory = ViewModelFactory.getInstance();
        DetailViewModel viewModel = new ViewModelProvider(this,
                factory).get(DetailViewModel.class);

        Movie movie = (Movie) getIntent().getSerializableExtra(EXTRA_MOVIE);
        if (movie != null) {
            viewModel.setDetailView(movie);
            setupDetail(viewModel.getDetailView());
        }

    }

    private void setupDetail(Movie movie) {
        String year = movie.getReleaseDate() != null ? movie.getReleaseDate() : movie.getFirstAirDate();
        String title = movie.getTitle() != null ? movie.getTitle() : movie.getName();
        Glide.with(this)
                .load("https://image.tmdb.org/t/p/w500/" + movie.getBackdropPath())
                .transform(new RoundedCorners(20))
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                .into(detailBinding.ivCover);
        detailBinding.tvTitle.setText(title);
        detailBinding.language.setText(movie.getOriginalLanguage().toUpperCase());
        detailBinding.year.setText(year);
        detailBinding.synopsis.setText(movie.getOverview());
    }
}