package service;

import model.Movie;
import model.User;
import java.util.*;

public class Recommender {
    public List<Movie> recommendMovies(User user , List<Movie>allMovies){
        List<Movie>recommend=new ArrayList<>();

        for(Movie movie : allMovies){
            for(String prefGenre :user.getpref()){
                if(movie.getgenres().contains(prefGenre)){
                    recommend.add(movie);
                    break;
                }
            }
        }
        return recommend;
    }
}
