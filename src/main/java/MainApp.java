import model.*;
import data.MovieDatabase;
import service.Recommender;
import java.util.*;
import java.util.stream.Collectors;

//The main user interface for the user and the recommender;
public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Takes user's name as keyboard input;
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        // Takes user input of genre preferences as a string;
        System.out.println(
                "\nPlease select the genres from the following\n1. Action\n2. Adventure\n3. Animation\n4. Biography\n5. Comedy\n6. Crime\n7. Drama\n8. Family\n9. Fantasy\n10. Horror\n11. Music\n12. Musical\n13. Mystery\n14. Romance\n15. Sci-Fi\n16. Spy\n17. Thriller\n\n (Note: Entry format <genre name>:<your preference on a scale of 1-10>,)");
        // removes blank spaces on the front, rear and splits the string as an array following <element>,<element>;
        Map<String,Double> genres = Arrays.stream(sc.nextLine().split(","))
                                            .map(s ->s.split(":"))
                                            .filter(a -> a.length == 2)
                                            .collect(Collectors.toMap(
                                                a->a[0].trim(),
                                                a->Double.parseDouble(a[1].trim())));
        System.out.println("Enter your watch history (Note: Input format <moviename>,<moviename>,...):");
        List<String> watched = Arrays.stream(sc.nextLine().split(","))
                                      .map(String::trim)
                                      .collect(Collectors.toList());
        User user = new User(name, genres, watched);// Initialises the user;
        // fetches all the movies from the database(hard coded);
        List<Movie> allMovies = MovieDatabase.getAllMovies();
        // create the recommender object that recommends movies on basis of user
        // preference;
        Recommender recommender = new Recommender();
        // stores the recommendation list;
        List<Movie> recommendations = recommender.recommendMovies(user, allMovies);
        // Displays the movies recommended by the recommender;
        if (recommendations.isEmpty()) {
            System.out.println("No movies found for your preferences.");
        } else {
            System.out.println("Top 5 recommendations for " + user.getName() + ":\n");
            int i=1;
            for (Movie m : recommendations) {
                System.out.println(i+"."+ m.getTitle() + " (" + m.getRating() + "/10)\n"+"Overview:\n"+m.getOverview()+"\n");
                i++;
            }
        }

        sc.close();
    }
}
