package com.amazing.Shopping.data.repository;

import com.amazing.Shopping.data.entities.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Categories,Long> {
}
