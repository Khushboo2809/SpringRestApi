package com.springrest.example.SpringRestProjectExample.service;

import com.springrest.example.SpringRestProjectExample.entities.Courses;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CourseService {

    // Creating for loos coupling

    public List<Courses> getCourses();

    public Courses getCourse(long courseId);

   public Courses addCourse(Courses courses);

   public Courses updateCourse(Courses courses);

   public void deleteCourse(long perseLong);
}
