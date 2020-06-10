package com.example.filipo.models;

public class Movie {
    private String title;
    private String description;
    private String dname;
    private int thumbnail;
    private String studio;
    private String rating;
    private String streamingLink;
    private int coverPhoto;
    private String imgUlr;

    public Movie(String title, String imgUlr, int coverPhoto, String dname) {
        this.title = title;
        this.dname = dname;
        this.coverPhoto = coverPhoto;
        this.imgUlr = imgUlr;
    }

    public Movie(String title, int thumbnail, int coverPhoto, String dname) {
        this.title = title;
        this.thumbnail = thumbnail;
        this.coverPhoto = coverPhoto;
        this.dname = dname;
    }

    public Movie(String title, String description, String studio) {
        this.title = title;
        this.description = description;
        this.thumbnail = thumbnail;
        this.studio = studio;
        this.rating = rating;
        this.streamingLink = streamingLink;
    }

    public Movie(String title, int thumbnail) {
        this.title = title;
        this.thumbnail = thumbnail;
    }

    public String getImgUlr() {
        return imgUlr;
    }

    public void setImgUlr(String imgUlr) {
        this.imgUlr = imgUlr;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getCoverPhoto() {
        return coverPhoto;
    }

    public void setCoverPhoto(int coverPhoto) {
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
