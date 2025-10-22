
package model;

import java.util.*;

public class Movie {
    private String title;
    private List<String> genres;
    private double rating;
    private String overview;

    public Movie(String title, List<String> genres, double rating, String overview) {

        this.title = title;
        this.genres = genres;
        this.rating = rating;
        this.overview = overview;
    }

    public String getDetails() {
        return "Title:" + title + "\nGenres:" + genres + "\nRating:" + rating + "Stars";

    }

    public String getTitle() {
        return title;
    }

    public List<String> getgenres() {
        return genres;
    }

    public double getRating() {
        return rating;
    }

    public String getOverview() {
        return overview;
    }}
