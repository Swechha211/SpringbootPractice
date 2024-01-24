package com.example.blogjpa.repositories;

import com.example.blogjpa.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
