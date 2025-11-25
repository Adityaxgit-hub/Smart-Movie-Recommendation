package model;

import java.util.Arrays;
import java.util.Map;

//Example class to test the models movie, genre, user, and rating;
public class TestModels {
    public static void main(String[] args) {
        // creates movie class object and initialises it as follows;
        Movie m1 = new Movie("Inception", Arrays.asList("Sci-Fi", "Thriller"), 8.8, "Mind-bending story");
        // creates user class object with the given name, preferences and watch history;
        User u1 = new User(
                "Aditya",
                Map.of(
                    "Sci-Fi",9.0,
                    "Thriller",8.5
                ),
                Arrays.<String>asList(m1.getTitle()));
        // printing details of the models initialised prior;
        System.out.println("Movie details: \n" + m1);
        System.out.println();
        System.out.println("User details: \n" + u1);
        System.out.println();
    }
}
