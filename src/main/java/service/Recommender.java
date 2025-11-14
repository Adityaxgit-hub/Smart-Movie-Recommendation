package service;

import model.Movie;
import model.User;
import java.util.*;
import java.util.stream.Collectors;

//Class that creates the recommender object that recommends users the movies available in the database on the basis of user's genre preferences;
public class Recommender {
    //generates average matchScore of a movie(range: [1,10]);
    private double genreMatchScore(Movie movie,Map<String,Double> Ugenres){
        List<String> Mgenres = movie.getgenres();
        double total = 0.0;
        int count = 0;

        for(String genre:Mgenres){
            if(Ugenres.containsKey(genre)){
                total += Ugenres.get(genre);
                count++;
            }
        }

        return count > 0 ? total / count : 0.0;
    }
    
    public List<Movie> recommendMovies(User user, List<Movie> allMovies) {

    Map<String, Double> genrePref = user.getpref();

    if (genrePref == null || genrePref.isEmpty()) {
        System.out.println("No preferences provided. Cannot recommend movies.");
        return Collections.emptyList();
    }

    List<String> watched = user.getWatched();
    Map<Movie, Double> userScore = new HashMap<>();
    
    for (Movie movie : allMovies) {
        if (watched.contains(movie.getTitle())) {
            continue;
        }

        double genreScore = genreMatchScore(movie, genrePref);
        double finalScore = (0.7 * genreScore) + (0.3 * movie.getRating());
        userScore.put(movie, finalScore);
    }

    return userScore.entrySet().stream()
            .sorted(Map.Entry.<Movie, Double>comparingByValue().reversed())
            .limit(5)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
}
}
