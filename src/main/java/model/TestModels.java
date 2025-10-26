package model;

import java.util.Arrays;

public class TestModels {
    public static void main(String[] args) {
        Movie m1 = new Movie("Inception", Arrays.asList("Sci-Fi", "Thriller"), 8.8, "Mind-bending story");
        User u1 = new User(
            "Aditya",
            Arrays.<String>asList("Sci-Fi", "Action"),
            Arrays.<Movie>asList(m1)
        );
        Rating r1 = new Rating(m1, 9.5);

        System.out.println(m1.getDetails());
        System.out.println();
        System.out.println(u1.getDetails());
        System.out.println();
        System.out.println(r1.getDetails());
    }
}
