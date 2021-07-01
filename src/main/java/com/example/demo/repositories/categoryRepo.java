package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Category;

public interface categoryRepo extends CrudRepository<Category, Long>{
List<Category> findAll();
}
