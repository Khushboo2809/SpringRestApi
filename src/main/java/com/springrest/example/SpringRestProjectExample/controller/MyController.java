package com.springrest.example.SpringRestProjectExample.controller;

import com.springrest.example.SpringRestProjectExample.entities.Courses;
import com.springrest.example.SpringRestProjectExample.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

//    @GetMapping("/home")
//    public String home(){
//        return "This is home";
//    }

    // object created from service

    @Autowired
    private CourseService courseService;

    // Get Courses list

    @GetMapping("/courses")
    public List<Courses> getCourses(){

        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Courses getCourse(@PathVariable String courseId){

        return this.courseService.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public Courses addCourse(@RequestBody Courses courses) {

        return this.courseService.addCourse(courses);

    }

    @PutMapping("/{id}")
    public Courses updateCourse(@PathVariable String id, @RequestBody Courses courses) {
        return courseService.updateCourse(Long.parseLong(id), courses);

    }
}

