package com.example.filipo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private List<slide> slideList;
    private ViewPager sliderpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        sliderpager =findViewById(R.id.slider_pager);

        slideList = new ArrayList<>();
        //get api rest image and title new film
        slideList.add(new slide(R.drawable.slide1, "title slide 1"));
        slideList.add(new slide(R.drawable.slide2, "title slide 2"));

        SliderPagerAdapter adapter=new SliderPagerAdapter(this,slideList);
        sliderpager.setAdapter(adapter);
    }
}
