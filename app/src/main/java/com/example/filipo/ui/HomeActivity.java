package com.example.filipo.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.filipo.data.DataSours;
import com.example.filipo.models.Movie;
import com.example.filipo.adapter.MovieAdapter;
import com.example.filipo.adapter.MovieItemClickListener;
import com.example.filipo.R;
import com.example.filipo.adapter.SliderPagerAdapter;
import com.example.filipo.models.slide;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class HomeActivity extends AppCompatActivity implements MovieItemClickListener {

    private List<slide> slideList;
    private ViewPager sliderpager;
    private TabLayout indicator;
    private RecyclerView NewMoviesRV;
    private RecyclerView PopularMoviesRV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        iniView();
        iniSlider();
        iniNewMovie();
        iniPopularMovie();

    }

    private void iniPopularMovie() {
        MovieAdapter movieAdapterPopular = new MovieAdapter(this, DataSours.getPopularMovie(), this);
        PopularMoviesRV.setAdapter(movieAdapterPopular);
        PopularMoviesRV.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }

    private void iniNewMovie() {
        MovieAdapter movieAdapterNew = new MovieAdapter(this, DataSours.getNewMovie(), this);
        NewMoviesRV.setAdapter(movieAdapterNew);
        NewMoviesRV.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }

    private void iniSlider() {
        //Show four new movies
        //get api rest image and title new film
        slideList = new ArrayList<>();
        slideList.add(new slide(R.drawable.slide1, "title slide 1"));
        slideList.add(new slide(R.drawable.slide2, "title slide 2"));
        slideList.add(new slide(R.drawable.slide3, "title slide 3"));
        slideList.add(new slide(R.drawable.slide4, "title slide 4"));
        SliderPagerAdapter adapter = new SliderPagerAdapter(this, slideList);
        sliderpager.setAdapter(adapter);


        //setup time for slider
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new SliderTimer(), 4000, 6000);
        indicator.setupWithViewPager(sliderpager, true);
    }

    private void iniView() {
        sliderpager = (ViewPager) findViewById(R.id.slider_pager);
        indicator = (TabLayout) findViewById(R.id.indicator);
        NewMoviesRV = (RecyclerView) findViewById(R.id.RV_movieNew);
        PopularMoviesRV = (RecyclerView) findViewById(R.id.Rv_movePopular);
    }

    @Override
    public void onMoveClick(Movie movie, ImageView movieImageView) {
        //here we send movie information to detail activity
        //also we ll create transition animation between the tow activity
        Intent intent = new Intent(this, MovieDetailActivity.class);
        //send movie information to detail activity
        intent.putExtra("title", movie.getTitle());
        intent.putExtra("imgURL", movie.getThumbnail());
        intent.putExtra("imgCover", movie.getCoverPhoto());
        intent.putExtra("dName", movie.getDname());
        //create animation
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(HomeActivity.this, movieImageView, "sharedName");
        startActivity(intent, options.toBundle());
    }


    class SliderTimer extends TimerTask {
        //
        @Override
        public void run() {
            HomeActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (sliderpager.getCurrentItem() < slideList.size() - 1) {
                        sliderpager.setCurrentItem(sliderpager.getCurrentItem() + 1);
                    } else
                        sliderpager.setCurrentItem(0);
                }
            });
        }
    }
}
