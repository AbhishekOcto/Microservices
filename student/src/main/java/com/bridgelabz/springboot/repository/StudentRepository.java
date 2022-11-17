package com.bridgelabz.springboot.repository;

import com.bridgelabz.springboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> { //Integer--> Primary key
    Student findByName(String name);
}
