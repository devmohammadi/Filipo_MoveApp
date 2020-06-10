package com.example.filipo.data;

import android.view.View;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.filipo.R;
import com.example.filipo.models.Movie;

import java.util.ArrayList;
import java.util.List;

import com.android.volley.RequestQueue;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DataSours {

    String URL;
    String RESULT_URL;
    String BASE_URL = "https://api.themoviedb.org/3/movie/";
    String API_KEY = "?api_key=ab66cda7c4961a2384e5c24949cf99fe";
    private RequestQueue requestQueue;

    public void jsonParse() {
        RESULT_URL = "popular";
        URL = BASE_URL + RESULT_URL + API_KEY;
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, URL, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONArray jsonArray = response.getJSONArray("results");
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject results = jsonArray.getJSONObject(i);
                        String title = results.getString("title");
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
        requestQueue.add(jsonObjectRequest);
    }

    public static List<Movie> getNewMovie() {
        //Recyclerview setup for new movie
        List<Movie> lstMovieNew = new ArrayList<>();
//        lstMovieNew.add(new Movie("Move 1", R.drawable.movie1, R.drawable.splitercoverphoto, "Director's name"));
//        lstMovieNew.add(new Movie("Move 2", R.drawable.movie1, R.drawable.splitercoverphoto, "Director's name"));
//        lstMovieNew.add(new Movie("Move 3", R.drawable.movie1, R.drawable.splitercoverphoto, "Director's name"));
//        lstMovieNew.add(new Movie("Move 4", R.drawable.movie1, R.drawable.splitercoverphoto, "Director's name"));
//        lstMovieNew.add(new Movie("Move 5", R.drawable.movie1, R.drawable.splitercoverphoto, "Director's name"));
        return lstMovieNew;
    }

    public static List<Movie> getPopularMovie() {
        //Recyclerview setup for popular movie
        List<Movie> lstMoviePopular = new ArrayList<>();
//        lstMoviePopular.add(new Movie("Move 1", R.drawable.movie2, R.drawable.splitercoverphoto, "Director's name"));
//        lstMoviePopular.add(new Movie("Move 3", R.drawable.movie2, R.drawable.splitercoverphoto, "Director's name"));
//        lstMoviePopular.add(new Movie("Move 4", R.drawable.movie2, R.drawable.splitercoverphoto, "Director's name"));
//        lstMoviePopular.add(new Movie("Move 5", R.drawable.movie2, R.drawable.splitercoverphoto, "Director's name"));
        return lstMoviePopular;
    }


//        requestQueue = Volley.newRequestQueue(this);
//        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL, new Response.Listener<String>() {
//            @Override
//            public void onResponse(String response) {
//                if (response != null) {
//                    Log.e(TAG, "On Response : " + response);
//                    try {
//                        JSONArray jsonArray = new JSONArray(response);
//                        for (int i = 0; i < jsonArray.length(); i++) {
//                            JSONObject data = jsonArray.getJSONObject(i);
//                            movies.add(new Movies(data.getString("original_title")));
//                        }
//                        showRecyclerView();
//                    } catch (JSONException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Log.e(TAG,"onResponse: " +error);
//            }
//        });
//        Volley.newRequestQueue(this).add(stringRequest);


}

