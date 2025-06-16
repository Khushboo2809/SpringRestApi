package com.springrest.example.SpringRestProjectExample.dao;

import com.springrest.example.SpringRestProjectExample.entities.Courses;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CourseDao extends JpaRepository<Courses, Long> {
}
