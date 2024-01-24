package com.example.blogjpa.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "uname", nullable =false, length = 100)
    private String name;
    private String email;
    private String password;
    @Column(name = "about", nullable =false, length = 500)
    private String about;

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private List<Post> posts = new ArrayList<>();



}
