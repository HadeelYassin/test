package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.models.Product;

public interface productRepo extends CrudRepository<Product, Long> {
 List<Product> findAll();
}
