package com.example.filipo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.filipo.R;
import com.example.filipo.models.Movie;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {

    Context context;
    List<Movie> mData;
    MovieItemClickListener movieItemClickListener;


    //Create a constructive method
    public MovieAdapter(Context context, List<Movie> mData, MovieItemClickListener listener) {
        this.context = context;
        this.mData = mData;
        movieItemClickListener = listener;
    }

    @NonNull
    @Override
    public MovieAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Introducing the layer to be displayed (item layer)
        View view = LayoutInflater.from(context).inflate(R.layout.item_movie, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  MyViewHolder holder, int position) {
        //Create the amount of views created on the item_movie page
        //set items
        holder.tvTitle.setText(mData.get(position).getTitle());
        Glide.with(context).load(mData.get(position).getThumbnail()).centerCrop().placeholder(R.drawable.movie1).into(holder.imgMovie);
    }

    @Override
    public int getItemCount() {
        //Here we specify how many items we want to create according to the number of our list, ie the number of items in our list.
        return mData.size();
    }

    //Create a class that inherits from RecyclerView.Adapter.
    public class MyViewHolder extends RecyclerView.ViewHolder {

         TextView tvTitle;
         ImageView imgMovie;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            //call view
            tvTitle = itemView.findViewById(R.id.item_movie_Title);
            imgMovie = itemView.findViewById(R.id.item_movie_img);

            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick (View v){
                    //When the items are clicked, it passes the item to the onMoveClick method
                    movieItemClickListener.onMoveClick(mData.get(getAdapterPosition()),imgMovie);
                }
            });
        }
    }
}
