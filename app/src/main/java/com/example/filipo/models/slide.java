package com.example.filipo.models;

//Create model for SliderPagerAdapter
//Get the name of the movie and the movie poster from the web service for use in the slider

public class slide {

    private String Image;
    private String Title;

    public slide(String image, String title) {
        Image = image;
        Title = title;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
