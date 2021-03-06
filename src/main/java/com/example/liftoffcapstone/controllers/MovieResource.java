package com.example.liftoffcapstone.controllers;

import com.example.liftoffcapstone.Responses.MovieAggregateScores;
import com.example.liftoffcapstone.models.Movie;
import com.example.liftoffcapstone.models.data.MovieDao;
import com.example.liftoffcapstone.models.data.ReviewDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.example.liftoffcapstone.models.Review;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
public class MovieResource {

    @Autowired
    private MovieDao movieDao;

    @Autowired
    private ReviewDao reviewDao;

    @GetMapping("/movies")
    public List<Movie> retrieveAllMovies() {
        return movieDao.findAll();
    }

    @GetMapping("movies/{id}")
    public Movie retrieveMovie(@PathVariable long id) {
        Movie movie = movieDao.findById(id).orElse(null);

        return movie;
    }

    @GetMapping("movies/{id}/reviews/")
    public List<Review> retrieveAllReviewsFor(@PathVariable long id) {
        Movie movie = movieDao.findById(id).orElse(null);

        return movie.getReviews();
    }

    @GetMapping("movies/aggregates/")
    public List<MovieAggregateScores> retrieveAllAggregateScores() {
        List<MovieAggregateScores> allAggregates = new ArrayList<>();
        List<Movie> movies = movieDao.findAll();

        for (Movie movie : movies) {
            String movieName = movie.getTitle();
            long movieId = movie.getId();
            String moviePosterSource = movie.getPosterSource();
            double overallAggregate = 0;
            double plotAggregate = 0;
            double characterAggregate = 0;
            double threatAggregate = 0;
            double aestheticAggregate = 0;
            double graphicContentAggregate = 0;

            List<Review> reviews = movie.getReviews();

            for (Review review : reviews) {
                plotAggregate = plotAggregate + (review.getPlotRating());
                characterAggregate = characterAggregate + (review.getCharacterRating());
                threatAggregate = threatAggregate + (review.getThreatRating());
                aestheticAggregate = aestheticAggregate + (review.getAestheticRating());
                graphicContentAggregate = graphicContentAggregate + (review.getGraphicContentRating());
            }


            if(reviews.size() != 0) {
                plotAggregate = plotAggregate / (reviews.size());
                characterAggregate = characterAggregate / (reviews.size());
                threatAggregate = threatAggregate / (reviews.size());
                aestheticAggregate = aestheticAggregate / (reviews.size());
                graphicContentAggregate = graphicContentAggregate / (reviews.size());
                overallAggregate = (plotAggregate + characterAggregate + threatAggregate + aestheticAggregate) / 4;
            }




            MovieAggregateScores movieAggregate = new MovieAggregateScores(movieName, movieId, moviePosterSource, overallAggregate, plotAggregate,
                    characterAggregate, threatAggregate, aestheticAggregate, graphicContentAggregate);
            allAggregates.add(movieAggregate);
        }
        return allAggregates;
    }

    @GetMapping("movies/reviews")
    public List<Review> retrieveAllReviews() {
        return reviewDao.findAll();
    }

    @GetMapping("/movies/recent")
    public List<Movie> retrieveRecentlyReviewed() {
        List<Review> reviews = reviewDao.findAll();
        List<Movie> recentlyReviewed = new ArrayList<>();
        int reviewsLength = reviews.size();

        Movie mostRecentMovie = reviews.get(reviewsLength - 1).getMovie();
        Movie secondRecentMovie = reviews.get(reviewsLength - 2).getMovie();
        Movie thirdRecentMovie = reviews.get(reviewsLength - 3).getMovie();

        recentlyReviewed.add(mostRecentMovie);
        recentlyReviewed.add(secondRecentMovie);
        recentlyReviewed.add(thirdRecentMovie);

        return recentlyReviewed;
    }

    @PostMapping("/movies")
    public ResponseEntity<Void> createMovie(@RequestBody Movie movie) {
        Movie savedMovie = movieDao.save(movie);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedMovie.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @PostMapping("/movies/reviews/{id}")
    public ResponseEntity<Void> createReview(@RequestBody Review review, @PathVariable long id) {
        Movie attachedMovie = movieDao.findById(id).orElse(null);
        review.setMovie(attachedMovie);
        review = reviewDao.save(review);
        attachedMovie.addReview(review);
        movieDao.save(attachedMovie);


        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(review.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }
}
