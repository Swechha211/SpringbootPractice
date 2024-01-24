package com.example.blogjpa.services;

import com.example.blogjpa.payloads.CategoryDto;

import java.util.List;

public interface CategoryService {

    public CategoryDto createCategory(CategoryDto categoryDto);
    public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
    public void deleteCategory(Integer categoryId);
    CategoryDto getCategory(Integer categoryId);

    List<CategoryDto> getCategories();
}
