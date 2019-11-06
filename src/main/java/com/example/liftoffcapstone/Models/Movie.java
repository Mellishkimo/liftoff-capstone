package com.example.liftoffcapstone.Models;





public class Movie {

    private int id;

    private String name;

    private List<Review> reviews;

    public Movie(String name) {
        this.name = name;
    }

    public Movie() { }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
