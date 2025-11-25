package model;

public class Genre {
    private String name; //genre name;

    public Genre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return "Name: "+name;
    }
}
