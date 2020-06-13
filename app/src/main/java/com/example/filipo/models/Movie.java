package com.example.filipo.models;

//Create model for MovieAdapter
//Using the concept of encapsulation in object orientation, we define the required fields that we want to receive from the api

public class Movie {
    private String title;
    private String description;
    private String ReleaseDate;
    private String thumbnail;
    private String coverPhoto;

    public Movie(String title, String thumbnail, String coverPhoto, String ReleaseDate,String description) {
        this.title = title;
        this.thumbnail = thumbnail;
        this.coverPhoto = coverPhoto;
        this.ReleaseDate = ReleaseDate;
        this.description = description;
    }


    public String getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(String ReleaseDate) {
        this.ReleaseDate = ReleaseDate;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getCoverPhoto() {
        return coverPhoto;
    }

    public void setCoverPhoto(String coverPhoto) {
        this.coverPhoto = coverPhoto;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
