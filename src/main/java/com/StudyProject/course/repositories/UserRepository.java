package com.StudyProject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudyProject.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
	
}
