package com.beyond.kkwoborrow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.beyond.kkwoborrow.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
