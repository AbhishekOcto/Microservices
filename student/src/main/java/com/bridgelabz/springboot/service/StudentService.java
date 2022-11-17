package com.bridgelabz.springboot.service;

import com.bridgelabz.springboot.model.Student;

public interface StudentService {
	Student getById(int id);
	Student getByName(String name);
	boolean save(Student student);

}
