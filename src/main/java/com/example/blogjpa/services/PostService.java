package com.example.blogjpa.services;

import com.example.blogjpa.entities.Post;
import com.example.blogjpa.payloads.PostDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PostService {
    PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
    PostDto updatePost(PostDto postDto, Integer postId);
    void deletePost(Integer postId);
    List<PostDto> getAllPost();
    PostDto getPostById(Integer postId);
    List<PostDto> getPostByCategory(Integer categoryId);
    List<PostDto> getPostByUser(Integer userId);


}
