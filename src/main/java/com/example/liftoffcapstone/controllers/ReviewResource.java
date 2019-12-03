package com.example.liftoffcapstone.controllers;


import com.example.liftoffcapstone.models.data.ReviewDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins =  { "http://localhost:3000" })
@RestController
public class ReviewResource {

    @Autowired
    private ReviewDao reviewDao;

}
