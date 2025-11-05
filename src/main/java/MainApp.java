import model.*;
import data.MovieDatabase;
import service.Recommender;
import java.util.*;

//The main user interface for the user and the recommender;
public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Takes user's name as keyboard input;
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        // Takes user input of genre preferences as a string;
        System.out.println(
                "\nEnter your favorite genres(separated by comma)\nPlease select the genres from the following\n1. Action\n2. Adventure\n3. Animation\n4. Biography\n5. Comedy\n6. Crime\n7. Drama\n8. Family\n9. Fantasy\n10. Horror\n11. Music\n12. Musical\n13. Mystery\n14. Romance\n15. Sci-Fi\n16. Spy\n17. Thriller: ");
        // removes blank spaces on the front, rear and splits the string as an array
        // following <element>,<element>;
        List<String> genres = Arrays.asList(sc.nextLine().trim().split("\\s*,\\s*"));

        User user = new User(name, genres, new ArrayList<>());// Initialises the user;
        // fetches all the movies from the database(hard coded);
        List<Movie> allMovies = MovieDatabase.getAllMovies();
        // create the recommender object that recommends movies on basis of user
        // preference;
        Recommender recommender = new Recommender();
        // stores the recommendation list;
        List<Movie> recommendations = recommender.recommendMovies(user, allMovies);
        // Displays the movies recommended by the recommender;
        System.out.println("Top 5 recommendations for " + user.getName() + ":\n");
        if (recommendations.isEmpty()) {
            System.out.println("No movies found for your preferences.");
        } else {
            int i=1;
            for (Movie m : recommendations) {
                if(i>5)
                    break;
                System.out.println(i+"."+ m.getTitle() + " (" + m.getRating() + ")\n"+"Overview:\n"+m.getOverview()+"\n");
                i++;
            }
        }

        sc.close();
    }
}
