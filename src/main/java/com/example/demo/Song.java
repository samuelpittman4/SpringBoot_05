package com.example.demo;

public class Song {
    private long id;
    private String name;
    private String artist;
    private String album;
    private int rating;
    private int year;

    public long getId() {
        return id;
    }

    public long setId() {
        this.id = id;
        return 0;
    }

    public String getName() {
        return name;
    }

    public String setName() {
        this.name = name;
        return null;
    }

    public String getArtist() {
        return artist;
    }

    public String setArtist() {
        this.artist = artist;
        return null;
    }

    public String getAlbum() {
        return album;
    }

    public String setAlbum() {
        this.album = album;
        return null;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public int setYear() {
        this.year = year;
        return 0;
    }
}
