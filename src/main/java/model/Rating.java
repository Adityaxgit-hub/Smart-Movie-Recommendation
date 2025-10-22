package model;

public class Rating {

    private Movie movie;
    private double userRating;

    public Rating(Movie movie, double userRating) {
        this.movie = movie;
        this.userRating = userRating;
    }

    public Movie getMovie() {
        return movie;
    }

    public double getUserRating() {
        return userRating;
    }

    public String getDetails() {
        return "Movie:" + movie.getTitle() + "| User Rating :" + userRating + "/10";
    }

}
