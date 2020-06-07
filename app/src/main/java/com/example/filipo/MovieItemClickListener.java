package com.example.filipo;

import android.widget.ImageView;

public interface MovieItemClickListener {
    //we will need the imageView to make the shared animation between the tow activity
    void onMoveClick(Movie movie, ImageView movieImageView);
}
