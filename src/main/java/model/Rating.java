package model;
//(optional)creates rating object that stores user rating;
public class Rating {

    private Movie movie;
    private double userRating;
    //constructor to initialise user rating;
    public Rating(Movie movie, double userRating) {
        this.movie = movie;
        this.userRating = userRating;
    }
    //gets the movie of Movie class whose rating is being referenced;
    public Movie getMovie() {
        return movie;
    }
    //gets the user rating of the movie;
    public double getUserRating() {
        return userRating;
    }
    //gets complete details i.e, movie title and rating;
    public String getDetails() {
        return "Movie:" + movie.getTitle() + "| User Rating :" + userRating + "/10";
    }

}
