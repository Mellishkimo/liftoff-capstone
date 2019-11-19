package com.example.liftoffcapstone.controllers;

import com.example.liftoffcapstone.models.Movie;
import com.example.liftoffcapstone.models.data.MovieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
public class MovieResource {

    @Autowired
    private MovieDao movieDao;

    @GetMapping("/movies")
    public List<Movie> retrieveAllMovies() {
        return movieDao.findAll();
    }

    @GetMapping("movies/{id}")
    public Movie retrieveMovie(@PathVariable long id) {
        Optional<Movie> movie = movieDao.findById(id);

        return movie.get();
    }

    @PostMapping("/movies")
    public ResponseEntity<Void> createMovie(@RequestBody Movie movie) {
        Movie savedMovie = movieDao.save(movie);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedMovie.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }
}
