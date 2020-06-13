package com.example.filipo.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
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
        //get the data
        play_fab = findViewById(R.id.play_fab);

        String movieTitle = getIntent().getExtras().getString("title");
        String imageResourceId = getIntent().getExtras().getString("imgURL");
        String imageCover = getIntent().getExtras().getString("imgCover");
        String movieDname = getIntent().getExtras().getString("dName");
        String movieDescription = getIntent().getExtras().getString("description");

        MovieThumbnailImg = findViewById(R.id.detail_movie_img);
        Glide.with(this).load(imageResourceId).into(MovieThumbnailImg);
       // MovieThumbnailImg.setImageResource(imageResourceId);

        MovieCoverImage = findViewById(R.id.detail_movie_cover);
        Glide.with(this).load(imageCover).into(MovieCoverImage);

        tvTitle = findViewById(R.id.detail_movie_title);
        tvTitle.setText(movieTitle);
        getSupportActionBar().setTitle(movieTitle);


        tvDescription = findViewById(R.id.detail_movie_desc);
        tvDescription.setText(movieDescription);

        tvReleaseDate = findViewById(R.id.detail_movie_ReleaseDate);
        tvReleaseDate.setText(movieDname);

        //setup animation
        MovieCoverImage.setAnimation(AnimationUtils.loadAnimation(this, R.anim.scale_animation));
        play_fab.setAnimation(AnimationUtils.loadAnimation(this, R.anim.scale_animation));
    }
}
