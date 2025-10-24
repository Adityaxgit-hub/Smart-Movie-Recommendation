package data;

import model.Movie;
import java.util.*;

public class MovieDatabase {

    public static List<Movie> getAllMovies() {
        List<Movie> movies = new ArrayList<>();

        // ---- Sci-Fi ----
        movies.add(new Movie("Inception", Arrays.asList("Sci-Fi", "Thriller"), 8.8, "A thief who steals dreams."));
        movies.add(new Movie("Interstellar", Arrays.asList("Sci-Fi", "Drama"), 8.6, "Journey beyond the stars."));
        movies.add(new Movie("The Matrix", Arrays.asList("Sci-Fi", "Action"), 8.7, "Reality is an illusion."));
        movies.add(new Movie("Avatar", Arrays.asList("Sci-Fi", "Adventure"), 7.9, "Humanity meets Pandora."));
        movies.add(new Movie("Dune", Arrays.asList("Sci-Fi", "Action"), 8.1, "A war on a desert planet."));
        movies.add(new Movie("Edge of Tomorrow", Arrays.asList("Sci-Fi", "Action"), 7.9, "Live. Die. Repeat."));
        movies.add(new Movie("Oblivion", Arrays.asList("Sci-Fi", "Action"), 7.0, "A drone repairman’s secret."));
        movies.add(new Movie("Tenet", Arrays.asList("Sci-Fi", "Thriller"), 7.5, "Time runs backward."));
        movies.add(new Movie("The Martian", Arrays.asList("Sci-Fi", "Adventure"), 8.0, "Survival on Mars."));
        movies.add(new Movie("Ready Player One", Arrays.asList("Sci-Fi", "Adventure"), 7.5, "Virtual world of OASIS."));

        // ---- Action ----
        movies.add(new Movie("The Dark Knight", Arrays.asList("Action", "Drama"), 9.0, "Batman faces the Joker."));
        movies.add(new Movie("Avengers: Endgame", Arrays.asList("Action", "Sci-Fi"), 8.4, "Final battle for the universe."));
        movies.add(new Movie("John Wick", Arrays.asList("Action", "Thriller"), 7.9, "Revenge of a hitman."));
        movies.add(new Movie("Mad Max: Fury Road", Arrays.asList("Action", "Adventure"), 8.1, "Chase in a desert wasteland."));
        movies.add(new Movie("Gladiator", Arrays.asList("Action", "Drama"), 8.5, "A Roman general seeks vengeance."));
        movies.add(new Movie("The Raid", Arrays.asList("Action", "Thriller"), 7.6, "SWAT team in a deadly tower."));
        movies.add(new Movie("Extraction", Arrays.asList("Action", "Thriller"), 7.0, "Mercenary mission in Dhaka."));
        movies.add(new Movie("Top Gun: Maverick", Arrays.asList("Action", "Drama"), 8.3, "The return of a fighter pilot."));
        movies.add(new Movie("Skyfall", Arrays.asList("Action", "Spy"), 7.8, "James Bond faces his past."));
        movies.add(new Movie("Mission Impossible: Fallout", Arrays.asList("Action", "Spy"), 8.0, "Ethan Hunt saves the world."));

        // ---- Drama ----
        movies.add(new Movie("The Shawshank Redemption", Arrays.asList("Drama"), 9.3, "Hope inside prison walls."));
        movies.add(new Movie("Forrest Gump", Arrays.asList("Drama", "Romance"), 8.8, "Life through Forrest’s eyes."));
        movies.add(new Movie("Fight Club", Arrays.asList("Drama", "Thriller"), 8.8, "An underground revolution."));
        movies.add(new Movie("The Green Mile", Arrays.asList("Drama", "Fantasy"), 8.6, "A miracle on death row."));
        movies.add(new Movie("The Pursuit of Happyness", Arrays.asList("Drama"), 8.0, "Struggles of a single father."));
        movies.add(new Movie("Joker", Arrays.asList("Drama", "Thriller"), 8.4, "A man’s descent into madness."));
        movies.add(new Movie("Whiplash", Arrays.asList("Drama", "Music"), 8.5, "Perfection through pain."));
        movies.add(new Movie("12 Angry Men", Arrays.asList("Drama"), 9.0, "Jury’s heated debate."));
        movies.add(new Movie("Parasite", Arrays.asList("Drama", "Thriller"), 8.6, "Class divide and deception."));
        movies.add(new Movie("The Social Network", Arrays.asList("Drama", "Biography"), 7.7, "Birth of Facebook."));

        // ---- Romance ----
        movies.add(new Movie("Titanic", Arrays.asList("Romance", "Drama"), 7.9, "A tragic shipboard love story."));
        movies.add(new Movie("La La Land", Arrays.asList("Romance", "Musical"), 8.0, "Love and dreams in LA."));
        movies.add(new Movie("The Notebook", Arrays.asList("Romance", "Drama"), 7.8, "A love remembered."));
        movies.add(new Movie("Pride & Prejudice", Arrays.asList("Romance", "Drama"), 8.0, "Classic tale of love."));
        movies.add(new Movie("500 Days of Summer", Arrays.asList("Romance", "Comedy"), 7.7, "A modern love story."));
        movies.add(new Movie("Me Before You", Arrays.asList("Romance", "Drama"), 7.4, "Unexpected love blossoms."));
        movies.add(new Movie("The Fault in Our Stars", Arrays.asList("Romance", "Drama"), 7.7, "Love through illness."));
        movies.add(new Movie("Call Me by Your Name", Arrays.asList("Romance", "Drama"), 8.0, "Summer love in Italy."));
        movies.add(new Movie("Crazy Rich Asians", Arrays.asList("Romance", "Comedy"), 7.0, "Love among the wealthy."));
        movies.add(new Movie("The Vow", Arrays.asList("Romance", "Drama"), 6.8, "Love after memory loss."));

        // ---- Thriller ----
        movies.add(new Movie("Se7en", Arrays.asList("Thriller", "Crime"), 8.6, "A hunt for a serial killer."));
        movies.add(new Movie("Gone Girl", Arrays.asList("Thriller", "Mystery"), 8.1, "A wife’s mysterious disappearance."));
        movies.add(new Movie("Shutter Island", Arrays.asList("Thriller", "Mystery"), 8.2, "A detective’s twisted investigation."));
        movies.add(new Movie("Prisoners", Arrays.asList("Thriller", "Crime"), 8.1, "A father’s desperate search."));
        movies.add(new Movie("The Prestige", Arrays.asList("Thriller", "Drama"), 8.5, "Magicians’ deadly rivalry."));
        movies.add(new Movie("Memento", Arrays.asList("Thriller", "Mystery"), 8.4, "A man with short-term memory loss."));
        movies.add(new Movie("Oldboy", Arrays.asList("Thriller", "Action"), 8.4, "15 years in captivity."));
        movies.add(new Movie("The Silence of the Lambs", Arrays.asList("Thriller", "Horror"), 8.6, "Hannibal Lecter’s mind games."));
        movies.add(new Movie("Nightcrawler", Arrays.asList("Thriller", "Crime"), 7.9, "Chasing crime for fame."));
        movies.add(new Movie("Zodiac", Arrays.asList("Thriller", "Crime"), 7.9, "True story of the Zodiac killer."));

        // ---- Comedy ----
        movies.add(new Movie("The Hangover", Arrays.asList("Comedy"), 7.7, "Bachelor party gone wrong."));
        movies.add(new Movie("Superbad", Arrays.asList("Comedy"), 7.6, "Teen comedy of friendship."));
        movies.add(new Movie("21 Jump Street", Arrays.asList("Comedy", "Action"), 7.2, "Undercover cops in high school."));
        movies.add(new Movie("The Dictator", Arrays.asList("Comedy"), 6.4, "A dictator’s adventures in America."));
        movies.add(new Movie("Deadpool", Arrays.asList("Comedy", "Action"), 8.0, "The anti-hero’s journey."));
        movies.add(new Movie("Jumanji: Welcome to the Jungle", Arrays.asList("Comedy", "Adventure"), 6.9, "Players trapped in a game."));
        movies.add(new Movie("Free Guy", Arrays.asList("Comedy", "Sci-Fi"), 7.2, "A self-aware game character."));
        movies.add(new Movie("The Intern", Arrays.asList("Comedy", "Drama"), 7.1, "A senior intern’s second chance."));
        movies.add(new Movie("The Wolf of Wall Street", Arrays.asList("Comedy", "Biography"), 8.2, "Greed and excess on Wall Street."));
        movies.add(new Movie("Yes Man", Arrays.asList("Comedy", "Romance"), 6.8, "Say yes to everything."));

        // ---- Horror ----
        movies.add(new Movie("The Conjuring", Arrays.asList("Horror", "Thriller"), 7.5, "Supernatural investigators."));
        movies.add(new Movie("It", Arrays.asList("Horror", "Thriller"), 7.3, "Evil clown terrorizes town."));
        movies.add(new Movie("A Quiet Place", Arrays.asList("Horror", "Sci-Fi"), 7.5, "Silence is survival."));
        movies.add(new Movie("Hereditary", Arrays.asList("Horror", "Drama"), 7.3, "Family horror and tragedy."));
        movies.add(new Movie("Get Out", Arrays.asList("Horror", "Thriller"), 7.8, "A terrifying social thriller."));
        movies.add(new Movie("Us", Arrays.asList("Horror", "Thriller"), 6.9, "Doppelgängers haunt a family."));
        movies.add(new Movie("Insidious", Arrays.asList("Horror", "Thriller"), 6.8, "Astral projection gone wrong."));
        movies.add(new Movie("The Ring", Arrays.asList("Horror", "Mystery"), 7.1, "Cursed videotape kills."));
        movies.add(new Movie("Annabelle", Arrays.asList("Horror", "Thriller"), 6.5, "Possessed doll terror."));
        movies.add(new Movie("Sinister", Arrays.asList("Horror", "Mystery"), 6.8, "Eerie tapes of murders."));

        // ---- Animation ----
        movies.add(new Movie("Toy Story", Arrays.asList("Animation", "Family"), 8.3, "Toys come alive."));
        movies.add(new Movie("Finding Nemo", Arrays.asList("Animation", "Adventure"), 8.1, "A father’s underwater search."));
        movies.add(new Movie("Up", Arrays.asList("Animation", "Adventure"), 8.2, "An old man’s flying house."));
        movies.add(new Movie("Coco", Arrays.asList("Animation", "Music"), 8.4, "Day of the Dead adventure."));
        movies.add(new Movie("Zootopia", Arrays.asList("Animation", "Comedy"), 8.0, "A bunny cop solves a mystery."));
        movies.add(new Movie("Inside Out", Arrays.asList("Animation", "Family"), 8.1, "Emotions inside a girl’s mind."));
        movies.add(new Movie("The Lion King", Arrays.asList("Animation", "Drama"), 8.5, "The circle of life."));
        movies.add(new Movie("Frozen", Arrays.asList("Animation", "Musical"), 7.4, "Sisters and ice magic."));
        movies.add(new Movie("Moana", Arrays.asList("Animation", "Adventure"), 7.6, "Voyage of courage."));
        movies.add(new Movie("How to Train Your Dragon", Arrays.asList("Animation", "Adventure"), 8.1, "A boy and his dragon."));

        return movies;
    }
}
