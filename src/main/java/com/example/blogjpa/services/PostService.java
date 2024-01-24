package com.example.blogjpa.services;

import com.example.blogjpa.entities.Post;
import com.example.blogjpa.payloads.PostDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PostService {
    Post createPost(PostDto postDto, Integer userId, Integer categoryId);
    Post updatePost(PostDto postDto, Integer postId);
    void deletePost(Integer postId);
    List<Post> getAllPost();
    Post getPostById(Integer postId);
    List<Post> getPostByCategory(Integer categoryId);
    List<Post> getPostByUser(Integer userId);


}
