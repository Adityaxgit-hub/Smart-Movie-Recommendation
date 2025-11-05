package model;

//creates genre object that stores the name of genre;
public class Genre {
    // Stores users genre preference;
    private String name;

    // constructor to initialise;
    public Genre(String name) {
        this.name = name;
    }

    // gets genre name;
    public String getName() {
        return name;
    }

    // ??
    public void setName(String name) {
        this.name = name;
    }
}
