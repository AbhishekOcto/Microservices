package com.bridgelabz.controller;

import com.bridgelabz.entity.Course;
import com.bridgelabz.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value= "/course")
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping
    public boolean create(@RequestBody Course course) {
        return courseService.create(course);
    }

    @GetMapping
    public List<Course> getAll() {
        return courseService.getAll();
    }

    @GetMapping("/id")
    public Course getById(@RequestParam(value = "id", defaultValue = "1") int id) {
        return courseService.getById(id);
    }

    //localhost:8081/course/id?id=2

    @PutMapping
    public boolean update(@RequestBody Course course) {
        return courseService.update(course);
    }

    @DeleteMapping
    public boolean delete(@RequestParam int id) {
        return courseService.delete(id);
    }
}
