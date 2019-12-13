package com.example.liftoffcapstone.models;



import javax.persistence.*;
import java.util.List;


@Entity
public class Movie {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String posterSource;

    @OneToMany
    @JoinColumn
    private List<Review> reviews;

    public Movie(String title, String posterSource) {
        this.title = title;
        this.posterSource = posterSource;

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

    public String getPosterSource() {
        return posterSource;
    }

    public void setPosterSource(String posterSource) {
        this.posterSource = posterSource;
    }

    public void addReview(Review review) { reviews.add(review);}

    public List<Review> getReviews() { return reviews;}


}
