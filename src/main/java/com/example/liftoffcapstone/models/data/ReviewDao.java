package com.example.liftoffcapstone.models.data;

import com.example.liftoffcapstone.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ReviewDao extends JpaRepository<Review, Long> {
}
