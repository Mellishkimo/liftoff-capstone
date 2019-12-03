package com.example.liftoffcapstone.models;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Movie {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @OneToMany
    @JoinColumn
    private List<Review> reviews;

    public Movie(String title) {
        this.title = title;
    }

    public Movie() { }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addReview(Review review) { reviews.add(review);}

    public List<Review> getReviews() { return reviews;}


}
