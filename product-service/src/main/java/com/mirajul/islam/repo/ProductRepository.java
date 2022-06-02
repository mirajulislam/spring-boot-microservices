package com.mirajul.islam.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mirajul.islam.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}