package com.amazing.submission2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MoviesDetailActivity extends AppCompatActivity {
    public static final String EXTRA_MOVIE = "extra_movie";
    TextView tvTitle, tvDateReleased, tvOverview,
            tvRevenue, tvUserScore, tvRuntime, tvGenre;

    ImageView imagePoster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_detail);

        tvTitle = findViewById(R.id.tv_item_title);
        tvUserScore = findViewById(R.id.tv_item_userScore);
        tvRevenue = findViewById(R.id.tv_item_revenue);
        tvOverview = findViewById(R.id.tv_item_overview);
        tvDateReleased = findViewById(R.id.tv_item_dateReleased);
        tvRuntime = findViewById(R.id.tv_item_runtime);
        tvGenre = findViewById(R.id.tv_item_genre);
        imagePoster = findViewById(R.id.poster);

        Movies movie = getIntent().getParcelableExtra(EXTRA_MOVIE);

        tvTitle.setText(movie.getTitle());
        tvUserScore.setText(movie.getUser_score());
        tvRevenue.setText(movie.getRevenue());
        tvOverview.setText(movie.getOverview());
        tvDateReleased.setText(movie.getYear_in());
        tvRuntime.setText(movie.getRuntime());
        tvGenre.setText(movie.getGenre());

        Glide.with(this)
                .load(movie.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(imagePoster);
    }
}
