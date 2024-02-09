package com.example.blogjpa.repositories;

import com.example.blogjpa.entities.Category;
import com.example.blogjpa.entities.Post;

import com.example.blogjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Integer> {

    List<Post> findByUser(User user);
    List<Post> findByCategory(Category category);
}
