package com.example.goshadudarproject.repo;

import com.example.goshadudarproject.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
