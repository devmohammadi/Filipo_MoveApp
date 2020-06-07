package com.example.filipo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MovieDetailActivity extends AppCompatActivity {

    private ImageView MovieThumbnailImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        //get the data
        String movieTitle = getIntent().getExtras().getString("title");
        int imageResourceId = getIntent().getExtras().getInt("imgURL");
        MovieThumbnailImg = findViewById(R.id.detail_img);
        MovieThumbnailImg.setImageResource(imageResourceId);
    }
}
