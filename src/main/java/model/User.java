package model;

import java.util.*;

public class User {

    private String name;
    private List<String> pref;
    private List<String> Watched;

    public User(String name, List<String> pref, List<String> Watched) {
        this.name = name;
        this.pref = pref;
        this.Watched = Watched;
    }

    public String getName() {
        return name;
    }

    public List<String> getpref() {
        return pref;
    }

    public List<String> getWatched() {

        return Watched;
    }

    public String getDetails() {
        return "User:" + name + "\nPrefers:" + pref;
    }
}