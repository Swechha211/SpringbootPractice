package com.example.blogjpa.payloads;

import com.example.blogjpa.entities.Category;
import com.example.blogjpa.entities.User;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {
    private Integer postId;

    private String title;

    private String content;

    private String imageName;
    private Date addedDate;

    private CategoryDto category;

    private UserDto user;

}
