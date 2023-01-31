package com.StudyProject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudyProject.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
	
}
