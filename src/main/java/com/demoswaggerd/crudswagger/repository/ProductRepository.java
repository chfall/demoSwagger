package com.demoswaggerd.crudswagger.repository;

import com.demoswaggerd.crudswagger.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}