import model.*;
import data.MovieDatabase;
import service.Recommender;
import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your favorite genres(separated by comma)\nPlease select the genres from the following\n1. Action\n2. Adventure\n3. Animation\n4. Biography\n5. Comedy\n6. Crime\n7. Drama\n8. Family\n9. Fantasy\n10. Horror\n11. Music\n12. Musical\n13. Mystery\n14. Romance\n15. Sci-Fi\n16. Spy\n17. Thriller\n: ");
        List<String> genres = Arrays.asList(sc.nextLine().trim().split("\\s*,\\s*"));

        User user = new User(name, genres, new ArrayList<>());

        List<Movie> allMovies = MovieDatabase.getAllMovies();
        Recommender recommender = new Recommender();

        List<Movie> recommendations = recommender.recommendMovies(user, allMovies);

        System.out.println("\nRecommended Movies for " + user.getName() + ":");
        if (recommendations.isEmpty()) {
            System.out.println("No movies found for your preferences");
        } else {
            for (Movie m : recommendations) {
                System.out.println("- " + m.getTitle() + " (" + m.getRating() + ")");
            }
        }

        sc.close();
    }
}
