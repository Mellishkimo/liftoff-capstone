package com.example.liftoffcapstone.models.data;

import com.example.liftoffcapstone.models.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ReviewDao extends CrudRepository<Review, Long> {
}
