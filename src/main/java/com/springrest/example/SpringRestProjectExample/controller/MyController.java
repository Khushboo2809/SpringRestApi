package com.springrest.example.SpringRestProjectExample.controller;

import com.springrest.example.SpringRestProjectExample.entities.Courses;
import com.springrest.example.SpringRestProjectExample.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @PutMapping("/courses")
    public Courses updateCourse(@RequestBody Courses courses) {
        return courseService.updateCourse(courses);

    }
    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){

        try {
            this.courseService.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);

        } catch (Exception e){

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

