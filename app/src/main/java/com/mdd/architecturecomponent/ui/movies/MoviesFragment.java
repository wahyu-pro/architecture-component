package com.mdd.architecturecomponent.ui.movies;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.mdd.architecturecomponent.ItemClickListener;
import com.mdd.architecturecomponent.data.ViewModelFactory;
import com.mdd.architecturecomponent.data.remote.response.Movie;
import com.mdd.architecturecomponent.databinding.FragmentMoviesBinding;
import com.mdd.architecturecomponent.ui.detail.DetailActivity;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

public class MoviesFragment extends Fragment implements ItemClickListener {

    private FragmentMoviesBinding fragmentMoviesBinding;

    public MoviesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentMoviesBinding = FragmentMoviesBinding.inflate(inflater, container, false);
        return fragmentMoviesBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getActivity() != null) {

            ViewModelFactory factory = ViewModelFactory.getInstance();
            MoviesViewModel viewModel =
                    new ViewModelProvider(this, factory).get(MoviesViewModel.class);
            MoviesAdapter adapter = new MoviesAdapter(getContext());
            fragmentMoviesBinding.progressBar.setVisibility(VISIBLE);

            viewModel.getMovies().observe(this, movies -> {
                fragmentMoviesBinding.progressBar.setVisibility(GONE);
                adapter.setMovies(movies, MoviesFragment.this);
                adapter.notifyDataSetChanged();
            });

            fragmentMoviesBinding.rvMovie.setLayoutManager(new LinearLayoutManager(getContext()));
            fragmentMoviesBinding.rvMovie.setHasFixedSize(true);
            fragmentMoviesBinding.rvMovie.setAdapter(adapter);

        }
    }

    @Override
    public void onItemClickCallback(Movie movie) {
        startActivity(new Intent(getContext(), DetailActivity.class)
                .putExtra(DetailActivity.EXTRA_MOVIE, movie));
    }
}