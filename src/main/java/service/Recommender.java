package service;

import model.Movie;
import model.User;
import java.util.*;
//Class that creates the recommender object that recommends users the movies available in the database on the basis of user's genre preferences;
public class Recommender {
    public List<Movie> recommendMovies(User user, List<Movie> allMovies) {
        List<Movie> recommend = new ArrayList<>();
        //loops through all the movies in the database;
        for (Movie movie : allMovies) {
            //loops through all of user's preferred genres to check recommendability;
            for (String prefGenre : user.getpref()) {
                //adds the movie to recommendation list if it belongs to the user's preferred genre;
                if (movie.getgenres().contains(prefGenre)) {
                    recommend.add(movie);
                    break;
                }
            }
        }
        //returns recommendation list;
        return recommend;
    }
}
