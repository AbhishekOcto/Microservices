package com.bridgelabz.springboot.service.impl;

import com.bridgelabz.springboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.springboot.model.Student;
import com.bridgelabz.springboot.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student getById(int id) {
		Student s = studentRepository.findById(id).orElse(null);
		return s;
	}

	@Override
	public Student getByName(String name) {
		Student s = studentRepository.findByName(name);
		return s;
	}

	@Override
	public boolean save(Student student) {
		studentRepository.save(student);
		return false;
	}
	
	//http://localhost:8080/student/id?id=1
}
