package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hej");

	// write your code here
    }



    @Test
    public void FindMostPopularArtist()
    {
        String[] artistsToBook = {"Foo Fighters", "Linkin Park", "Pink"};
        var list = new ArrayList<Artist>();
        for (var artist : artistsToBook) {
            list.add(new Artist(artist));
        }
        var finder = new PopularityFinder(list);
        var expectedMostPopular = list.get(2);
        var bookings = new ArrayList<Booking>();
        bookings.add(new Booking(list.get(0)));
        bookings.add(new Booking(list.get(1)));
        bookings.add(new Booking(list.get(2)));
        bookings.add(new Booking(list.get(2)));
        bookings.add(new Booking(list.get(2)));
        bookings.add(new Booking(list.get(2)));

        var mostPopular = finder.FindMostPopularArtist(bookings);

        assertEquals(mostPopular, expectedMostPopular);
    }
}
