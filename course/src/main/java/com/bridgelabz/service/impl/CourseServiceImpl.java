package com.bridgelabz.service.impl;

import com.bridgelabz.entity.Course;
import com.bridgelabz.repository.CourseRepository;
import com.bridgelabz.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Override
    public boolean create(Course course) {
        courseRepository.save(course);
        return true;
    }

    @Override
    public Course getById(int courseId) {
        Course course = courseRepository.findById(courseId).orElse(null);
        return course;
    }

    @Override
    public List<Course> getAll() {
        List<Course> courseList = courseRepository.findAll();
        return courseList;
    }

    @Override
    public boolean update(Course course) {
        courseRepository.save(course);
        return true;
    }

    @Override
    public boolean delete(int courseId) {
        courseRepository.deleteById(courseId);
        return true;
    }

}
