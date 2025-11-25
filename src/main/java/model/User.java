package model;

import java.util.*;

public class User {

    private String name;
    private Map<String, Double> pref;
    private List<String> Watched;

    public User(String name, Map<String,Double> pref, List<String> Watched) {
        this.name = name;
        this.pref = pref;
        this.Watched = Watched;
    }

    public String getName() {
        return name;
    }

    public Map<String,Double> getpref() {
        return pref;
    }

    public List<String> getWatched() {
        return Watched;
    }

    @Override
    public String toString(){
        return "Name: "+name+"| Prferences: "+pref+"| Watch History: "+Watched;
    }
}