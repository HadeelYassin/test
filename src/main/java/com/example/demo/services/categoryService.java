package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.models.Category;
import com.example.demo.repositories.categoryRepo;

@Service
public class categoryService {
	private categoryRepo catRepo;

	public categoryService(categoryRepo catRepo) {
		super();
		this.catRepo = catRepo;
	}
	
	public Category createCat(Category cat) {
		return catRepo.save(cat);
	}
	
	public Category findCat(Long id) {
		
	}

}
