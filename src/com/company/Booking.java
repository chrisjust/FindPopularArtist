package com.company;

public class Booking {
    private Artist artist;

    public Booking (Artist artist){

        this.artist = artist;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
