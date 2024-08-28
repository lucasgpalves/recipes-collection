package com.college.recipes_collection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college.recipes_collection.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
    
}
