package com.company;

import java.util.Comparator;

public class Album implements Comparable<Album>{
    private String name;
    private String artist;
    private float rating;
    private int publishYear;

    public Album(String name, String artist, float rating, int publishYear) {
        this.name = name;
        this.artist = artist;
        this.rating = rating;
        this.publishYear = publishYear;
    }

    @Override
    public int compareTo(Album other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", rating=" + rating +
                ", publishYear=" + publishYear +
                "}\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
}

class RatingCompare implements Comparator<Album>{

    @Override
    public int compare(Album a1, Album a2) {
        float r1 = a1.getRating();
        float r2 = a2.getRating();
        if(r1 < r2) return -1;
        if(r1 > r2) return 1;
        return 0;
    }
}

class YearCompare implements Comparator<Album>{

    @Override
    public int compare(Album a1, Album a2) {
        return a1.getPublishYear() - a2.getPublishYear();
    }
}
