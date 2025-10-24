import model.*;
import data.MovieDatabase;
import service.Recommender;
import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your favorite genres (separated by comma): ");
        List<String> genres = Arrays.asList(sc.nextLine().trim().split("\\s*,\\s*"));

        User user = new User(name, genres, new ArrayList<>());

        List<Movie> allMovies = MovieDatabase.getAllMovies();
        Recommender recommender = new Recommender();

        List<Movie> recommendations = recommender.recommendMovies(user, allMovies);

        System.out.println("\n🎥 Recommended Movies for " + user.getName() + ":");
        if (recommendations.isEmpty()) {
            System.out.println("No movies found for your preferences 😢");
        } else {
            for (Movie m : recommendations) {
                System.out.println("- " + m.getTitle() + " (" + m.getRating() + "⭐)");
            }
        }

        sc.close();
    }
}
