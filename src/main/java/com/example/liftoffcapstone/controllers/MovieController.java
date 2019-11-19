package com.example.liftoffcapstone.controllers;

import com.example.liftoffcapstone.models.Movie;
import com.example.liftoffcapstone.models.data.MovieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("movies")
public class MovieController {

    @Autowired
    private MovieDao movieDao;



}
