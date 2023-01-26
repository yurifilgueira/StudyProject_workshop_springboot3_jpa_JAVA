package com.StudyProject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudyProject.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
	
}
