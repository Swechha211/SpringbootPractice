package com.example.jdbcblog2.services;

import com.example.jdbcblog2.entities.Post;
import com.example.jdbcblog2.entities.User;
import com.example.jdbcblog2.repositories.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepo postRepo;


    public List<Post> getAllBlogs() {
        return postRepo.findAll();
    }

    public Post getBlogById(Integer id) {
        return postRepo.findById(id);
    }

    public void createBlog(Post blog) {
        validatePost(blog);
        postRepo.save(blog);
    }

    public void updateBlog(Integer id, Post updatedBlog) {
        Post existingBlog = postRepo.findById(id);
        validatePost(existingBlog);
        if (existingBlog != null) {
            existingBlog.setTitle(updatedBlog.getTitle());
            existingBlog.setContent(updatedBlog.getContent());
            postRepo.update(existingBlog);
        }
    }

    public void deleteBlog( Integer id) {
        postRepo.delete(id);
    }

    public Post getBlogByUser(User user) {
        return postRepo.findByUser(user);
    }

    private void validatePost(Post post) {
        if (post.getTitle() == null || post.getTitle().trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }

        if (post.getContent() == null || post.getContent().trim().isEmpty()) {
            throw new IllegalArgumentException("Content cannot be empty");
        }

    }



}
