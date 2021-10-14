package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PopularityFinder {

    private ArrayList<Artist> artists;

    public PopularityFinder(ArrayList<Artist> artists){

        this.artists = artists;
    }

    public Artist FindMostPopularArtist(ArrayList<Booking> bookings){
        HashMap<Artist, Integer> counter = new HashMap<Artist, Integer>();
        var index = 0;

        do {
            var booking = bookings.get(index);
            var artist = booking.getArtist();
            if (counter.containsKey(artist)) {
                counter.put(artist, counter.get(artist) + 1);
            } else {
                counter.put(artist, 1);
            }
            index++;
        } while (bookings.size()-1 >= index);

        Map.Entry<Artist, Integer> mostPopular = null;
        for (var e : counter.entrySet()) {
            if (mostPopular == null || e.getValue() > mostPopular.getValue()) {
                mostPopular = e;
            }
        }

        return mostPopular.getKey();
    }
}
