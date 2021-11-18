package ru.netology.domain;

public class Movie {
    private int id;
    private String name;
    private String imageURL;
    private String genre;
    private boolean premiereTomorrow;



    public Movie(int id, String name, String imageURL, String genre, boolean premiereTomorrow){
        this.id = id;
        this.name = name;
        this.imageURL = imageURL;
        this.genre = genre;
        this.premiereTomorrow = premiereTomorrow;
    }


}
