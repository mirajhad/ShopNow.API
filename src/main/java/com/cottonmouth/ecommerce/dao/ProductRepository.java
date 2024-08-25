package com.cottonmouth.ecommerce.dao;

import com.cottonmouth.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
