package com.example.filipo.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.filipo.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MovieDetailActivity extends AppCompatActivity {

    private ImageView MovieThumbnailImg;
    private ImageView MovieCoverImage;
    private TextView tvTitle;
    private TextView tvDescription;
    private TextView tvReleaseDate;
    private FloatingActionButton play_fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        iniViews();

    }

    void iniViews() {
        //call view
        play_fab = findViewById(R.id.play_fab);

        //get data
        String movieTitle = getIntent().getExtras().getString("title");
        String imageResourceId = getIntent().getExtras().getString("imgURL");
        String imageCover = getIntent().getExtras().getString("imgCover");
        String movieReleaseDate = getIntent().getExtras().getString("ReleaseDate");
        String movieDescription = getIntent().getExtras().getString("description");

        //set Thumbnail image movie chosen
        MovieThumbnailImg = findViewById(R.id.detail_movie_img);
        Glide.with(this).load(imageResourceId).centerCrop().placeholder(R.drawable.movie1).into(MovieThumbnailImg);

        //set cover image movie chosen
        MovieCoverImage = findViewById(R.id.detail_movie_cover);
        Glide.with(this).load(imageCover).centerCrop().placeholder(R.drawable.movie1).into(MovieCoverImage);

        //set text title movie chosen
        tvTitle = findViewById(R.id.detail_movie_title);
        tvTitle.setText(movieTitle);
        //set action bar with title movie chosen
        getSupportActionBar().setTitle(movieTitle);

        //set text description movie chosen
        tvDescription = findViewById(R.id.detail_movie_desc);
        tvDescription.setText(movieDescription);

        //set text release date movie chosen
        tvReleaseDate = findViewById(R.id.detail_movie_ReleaseDate);
        tvReleaseDate.setText(movieReleaseDate);

        //setup animation
        MovieCoverImage.setAnimation(AnimationUtils.loadAnimation(this, R.anim.scale_animation));
        play_fab.setAnimation(AnimationUtils.loadAnimation(this, R.anim.scale_animation));
    }
}
