package com.example.blogjpa.repositories;

import com.example.blogjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

}
