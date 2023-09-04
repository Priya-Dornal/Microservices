package com.example.Course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Course.model.Course;

public interface CourseRepository extends JpaRepository<Course,Integer>{

}
