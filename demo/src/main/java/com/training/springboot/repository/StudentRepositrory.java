package com.training.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.springboot.model.Student;

public interface StudentRepositrory extends JpaRepository<Student,Integer>{

}
