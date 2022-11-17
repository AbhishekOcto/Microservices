package com.bridgelabz.service;

import com.bridgelabz.entity.Course;

import java.util.List;

public interface CourseService {
    boolean create(Course course);

    Course getById(int courseId);

    List<Course> getAll();

    boolean update(Course course);

    boolean delete(int courseId);
}
