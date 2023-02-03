package com.StudyProject.course.services.exceptions.ResourceNotFoundException;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super("Respurce not found. Id: " + id);
	}
	
}
