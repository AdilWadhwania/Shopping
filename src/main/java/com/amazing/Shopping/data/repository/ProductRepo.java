package com.amazing.Shopping.data.repository;

import com.amazing.Shopping.data.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Long> {
}
