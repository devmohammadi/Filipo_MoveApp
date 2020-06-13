package com.example.filipo.models;

public class Movie {
    private String title;
    private String description;
    private String ReleaseDate;
    private String thumbnail;
    private String studio;
    private String rating;
    private String streamingLink;
    private String coverPhoto;

    public Movie(String title, String thumbnail, String coverPhoto, String ReleaseDate,String description) {
        this.title = title;
        this.thumbnail = thumbnail;
        this.coverPhoto = coverPhoto;
        this.ReleaseDate = ReleaseDate;
        this.description = description;
    }

    public Movie(String title, String thumbnail, String coverPhoto, String ReleaseDate) {
        this.title = title;
        this.thumbnail = thumbnail;
        this.coverPhoto = coverPhoto;
        this.ReleaseDate = ReleaseDate;
    }

    public Movie(String title, String description, String studio) {
        this.title = title;
        this.description = description;
        this.thumbnail = thumbnail;
        this.studio = studio;
        this.rating = rating;
        this.streamingLink = streamingLink;
    }

    public Movie(String title, String thumbnail) {
        this.title = title;
        this.thumbnail = thumbnail;
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

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStreamingLink() {
        return streamingLink;
    }

    public void setStreamingLink(String streamingLink) {
        this.streamingLink = streamingLink;
    }
}
