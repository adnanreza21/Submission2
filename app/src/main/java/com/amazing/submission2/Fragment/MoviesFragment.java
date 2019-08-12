package com.amazing.submission2.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.amazing.submission2.Adapter.CardViewMoviesAdapter;
import com.amazing.submission2.Movies;
import com.amazing.submission2.MoviesData;
import com.amazing.submission2.R;

import java.util.ArrayList;

public class MoviesFragment extends Fragment {

    private RecyclerView rvCategory;
    private ArrayList<Movies> list = new ArrayList<>();

    public MoviesFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movies, container, false);
        rvCategory = view.findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);
        list.addAll(MoviesData.getListData());
        showRecyclerMovie();
        return view;
    }

    private void showRecyclerMovie() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this.getContext()));
        CardViewMoviesAdapter cardViewMoviesAdapter = new CardViewMoviesAdapter(this.getContext());
        cardViewMoviesAdapter.setListMovies(list);
        rvCategory.setAdapter(cardViewMoviesAdapter);
    }
}
