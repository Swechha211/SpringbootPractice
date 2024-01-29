package com.example.jdbcblog2.repositories;

import com.example.jdbcblog2.entities.Post;
import com.example.jdbcblog2.entities.User;

import java.util.List;

public interface PostRepo {
    List<Post> findAll();
    Post findById(Integer id);
    Post findByUser(User user);
    void save(Post blog);
    void update(Post blog);
    void delete(Integer id);
}
