import model.*;
import data.MovieDatabase;
import service.Recommender;
import java.util.*;
import java.util.stream.Collectors;

class InvalidRatingException extends Exception{
    public InvalidRatingException (String msg){
        super(msg);
    }
}

//The main user interface for the user and the recommender;
public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println(
                "\nPlease select the genres from the following\n1.Sci-Fi\n2.Action\n3.Drama\n4.Romance\n5.Thriller\n6.Comedy\n7.Horror\n8.Animation\n\n (Note: Entry format <genre name>:<your preference on a scale of 1-10>,)");
        //first split at ',' and then at ':',filter out if not genre:preference type entry;
    try{
        
        // Parse the genres and their preference ratings; throw a user-defined
        // InvalidRatingException when a rating token is not a valid number
        String genreInput = sc.nextLine();
        Map<String, Double> genres = new HashMap<>();
        for (String token : genreInput.split(",")) {
            String[] parts = token.split(":");
            if (parts.length == 2) {
                String gName = parts[0].trim();
                String gRating = parts[1].trim();
                try {
                    double val = Double.parseDouble(gRating);
                    genres.put(gName, val);
                } catch (NumberFormatException nfe) {
                    // Wrap the parse failure into the custom exception message
                    throw new InvalidRatingException("enter a valid rating");
                }
            }
        }
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
        catch(InvalidRatingException e) {
            // Show friendly message for invalid rating input
            System.out.println(e.getMessage());
        }
        catch(NumberFormatException e) {
            // Fallback: show a helpful message when some other number parse failed
            System.out.println("enter a valid rating");
        }
        catch (Exception e){
        System.out.println("Exception" +e.getMessage());
    }
    finally{
              sc.close();
    }

    }
  
}

