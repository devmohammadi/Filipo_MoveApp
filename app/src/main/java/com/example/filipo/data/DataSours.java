package com.example.filipo.data;

import com.example.filipo.R;
import com.example.filipo.models.Movie;

import java.util.ArrayList;
import java.util.List;

public class DataSours {

    public static List<Movie>getNewMovie(){
        //Recyclerview setup for new movie
        List<Movie> lstMovieNew = new ArrayList<>();
        lstMovieNew.add(new Movie("Move 1", R.drawable.movie1, R.drawable.splitercoverphoto, "Director's name"));
        lstMovieNew.add(new Movie("Move 2", R.drawable.movie1, R.drawable.splitercoverphoto, "Director's name"));
        lstMovieNew.add(new Movie("Move 3", R.drawable.movie1, R.drawable.splitercoverphoto, "Director's name"));
        lstMovieNew.add(new Movie("Move 4", R.drawable.movie1, R.drawable.splitercoverphoto, "Director's name"));
        lstMovieNew.add(new Movie("Move 5", R.drawable.movie1, R.drawable.splitercoverphoto, "Director's name"));
        return lstMovieNew;
    }

    public static List<Movie>getPopularMovie(){
        //Recyclerview setup for popular movie
        List<Movie> lstMoviePopular = new ArrayList<>();
        lstMoviePopular.add(new Movie("Move 1", R.drawable.movie2, R.drawable.splitercoverphoto, "Director's name"));
        lstMoviePopular.add(new Movie("Move 2", R.drawable.movie2, R.drawable.splitercoverphoto, "Director's name"));
        lstMoviePopular.add(new Movie("Move 3", R.drawable.movie2, R.drawable.splitercoverphoto, "Director's name"));
        lstMoviePopular.add(new Movie("Move 4", R.drawable.movie2, R.drawable.splitercoverphoto, "Director's name"));
        lstMoviePopular.add(new Movie("Move 5", R.drawable.movie2, R.drawable.splitercoverphoto, "Director's name"));
        return lstMoviePopular;
    }
}
