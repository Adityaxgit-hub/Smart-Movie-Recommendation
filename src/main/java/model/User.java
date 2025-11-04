package model;

import java.util.*;
//creates user object that stores user data i.e, name, genre preferences and watch history;
public class User {

    private String name;
    private List<String> pref;
    private List<Movie> Watched;
    //constructor to initialise user data;
    public User(String name, List<String> pref, List<Movie> Watched) {
        this.name = name;
        this.pref = pref;
        this.Watched = Watched;
    }
    //gets the name of the user;
    public String getName() {
        return name;
    }
    //gets the genre preferences of the user;
    public List<String> getpref() {
        return pref;
    }
    //gets the watch history of the user;   
    public List<Movie> getWatched() {
        return Watched;
    }
    //gets complete user details;
    public String getDetails() {
        return "User:" + name + "\nPrefers:" + pref;
    }
}