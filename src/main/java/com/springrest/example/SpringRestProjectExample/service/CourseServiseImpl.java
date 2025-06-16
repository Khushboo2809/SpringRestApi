package com.springrest.example.SpringRestProjectExample.service;

import com.springrest.example.SpringRestProjectExample.dao.CourseDao;
import com.springrest.example.SpringRestProjectExample.entities.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CourseServiseImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;
    // temparory list

//    List<Courses> list;
//
  //  public CourseServiseImpl(){

//        list = new ArrayList<>();
//        list.add(new Courses(123, "Java Course", "This is java course"));
//        list.add(new Courses(125, "Spring boot Course", "This is Spring boot course"));

//}
    @Override
    public List<Courses> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Courses getCourse(long courseId) {
//        Courses c = null;
//        for (Courses course : list) {
//            if (course.getId() == courseId){
//                c = course;
//            break;
//        }
//    }
        return courseDao.getOne(courseId);
    }

    @Override
    public Courses addCourse(Courses courses) {
        //list.add(courses);
        courseDao.save(courses);
        return courses;
}

    @Override
    public Courses updateCourse(Courses courses) {
       // Courses courses=new Courses();
//        courses.getId(); // it will return course object
//        courses.setTitle("Angular"); // using setter method to change the name.
//        c.save(student);// here we are saving same object again to DB

//        list.forEach(e-> {
//            if (e.getId() == courses.getId()){
//                e.setTitle(courses.getTitle());
//                e.setDescription(courses.getDescription());
//            }
//        });

        courseDao.save(courses);
        return courses;
    }

    @Override
    public void deleteCourse(long perseLong) {
//        list = this.list.stream().filter(e->e.getId()!=perseLong)
//                .collect(Collectors.toList());

        Courses entity = courseDao.getOne(perseLong);

        courseDao.delete(entity);
    }


}
