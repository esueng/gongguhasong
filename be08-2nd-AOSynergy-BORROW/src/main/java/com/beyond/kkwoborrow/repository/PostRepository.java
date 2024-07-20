package com.beyond.kkwoborrow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.beyond.kkwoborrow.entity.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
