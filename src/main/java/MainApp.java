import model.*;
import data.MovieDatabase;
import service.Recommender;
import java.util.*;
import java.util.stream.Collectors;

//The main user interface for the user and the recommender;
public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println(
                "\nPlease select the genres from the following\n1.Sci-Fi\n2.Action\n3.Drama\n4.Romance\n5.Thriller\n6.Comedy\n7.Horror\n8.Animation\n\n (Note: Entry format <genre name>:<your preference on a scale of 1-10>,)");
        //first split at ',' and then at ':',filter out if not genre:preference type entry;
        Map<String,Double> genres = Arrays.stream(sc.nextLine().split(","))
                                          .map(s ->s.split(":"))
                                          .filter(a -> a.length == 2)
                                          .collect(Collectors.toMap(a->a[0].trim(),a->Double.parseDouble(a[1].trim())));
        System.out.println("Enter your watch history (Note: Input format <moviename>,<moviename>,...):");
        List<String> watched = Arrays.stream(sc.nextLine().split(","))
                                      .map(String::trim)
                                      .collect(Collectors.toList());
        User user = new User(name, genres, watched);
        // fetches all the movies from the database(hard coded);
        List<Movie> allMovies = MovieDatabase.getAllMovies();
        // create the recommender object;
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
