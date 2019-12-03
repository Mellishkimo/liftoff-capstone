package com.example.liftoffcapstone.models.data;

import com.example.liftoffcapstone.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface MovieDao extends JpaRepository<Movie, Long> {
}
