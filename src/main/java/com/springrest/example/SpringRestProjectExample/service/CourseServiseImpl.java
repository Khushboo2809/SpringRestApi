package com.springrest.example.SpringRestProjectExample.service;

import com.springrest.example.SpringRestProjectExample.entities.Courses;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiseImpl implements CourseService {

    // temparory list

    List<Courses> list;

    public CourseServiseImpl(){
        list = new ArrayList<>();
        list.add(new Courses(123, "Java Course", "This is java course"));
        list.add(new Courses(125, "Spring boot Course", "This is Spring boot course"));
    }
    @Override
    public List<Courses> getCourses() {
        return list;
    }

    @Override
    public Courses getCourse(long courseId) {
        Courses c = null;
        for (Courses course : list) {
            if (course.getId() == courseId){
                c = course;
            break;
        }
    }
        return c;
    }

    @Override
    public Courses addCourse(Courses courses) {
        list.add(courses);
        return courses;
}

    @Override
    public Courses updateCourse(long id, Courses courses) {
       // Courses courses=new Courses();
        courses.getId(); // it will return course object
        courses.setTitle("Angular"); // using setter method to change the name.
//        c.save(student);// here we are saving same object again to DB

        return courses;
    }


}
