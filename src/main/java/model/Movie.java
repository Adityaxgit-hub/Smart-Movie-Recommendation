package model;

import java.util.*;
// creates movie object that can be recommended to the user based on genre preference;
public class Movie {
    private String title;
    private List<String> genres;
    private double rating;
    private String overview;
    //constructor to initialise movie data;
    public Movie(String title, List<String> genres, double rating, String overview) {

        this.title = title;
        this.genres = genres;
        this.rating = rating;
        this.overview = overview;
    }
    //gets complete details of the selected movie;
    public String getDetails() {
        return "Title:" + title + "\nGenres:" + genres + "\nRating:" + rating + "Stars";

    }
    //gets title alone;
    public String getTitle() {
        return title;
    }
    //gets genres alone;
    public List<String> getgenres() {
        return genres;
    }
    //gets rating alone;
    public double getRating() {
        return rating;
    }
    //gets overview alone;
    public String getOverview() {
        return overview;
    }
}
