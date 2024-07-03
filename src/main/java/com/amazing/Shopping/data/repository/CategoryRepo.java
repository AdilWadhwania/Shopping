package com.amazing.Shopping.data.repository;

import com.amazing.Shopping.data.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Long> {
}
