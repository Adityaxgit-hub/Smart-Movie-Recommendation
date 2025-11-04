package model;

import java.util.Arrays;

//Example class to test the models movie, genre, user, and rating;
public class TestModels {
    public static void main(String[] args) {
        // creates movie class object and initialises it as follows;
        Movie m1 = new Movie("Inception", Arrays.asList("Sci-Fi", "Thriller"), 8.8, "Mind-bending story");
        // creates user class object with the given name, preferences and watch history;
        User u1 = new User(
                "Aditya",
                Arrays.<String>asList("Sci-Fi", "Action"),
                Arrays.<Movie>asList(m1));
        // creates a rating class object that rates the references movie;
        Rating r1 = new Rating(m1, 9.5);
        // printing details of the models initialised prior;
        System.out.println(m1.getDetails());
        System.out.println();
        System.out.println(u1.getDetails());
        System.out.println();
        System.out.println(r1.getDetails());
    }
}
