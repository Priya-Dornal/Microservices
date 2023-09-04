package com.training.springboot.controller;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.springboot.model.Student;
import com.training.springboot.repository.StudentRepositrory;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	StudentRepositrory repository;
	
	@GetMapping
	public String sayHi() {
		return "Hello from spring boot!!";
	}
	
	@GetMapping("/Student")
	public List<Student> getStudent(){
	List<Student> studList=repository.findAll();
	return studList;
	}
	
//@GetMapping("/Student/find/{id}")
////	public Student getStudentById(@RequestParam("id")int id)
//	public Student getStudentById(@PathVariable("id")int id)
//{
//		
//		Optional<Student> stud=repository.findById(id);
//		if(stud.isPresent()) {
//			return stud.get();
//			
//		}
//		else {
//			return null;
//			
//		}
//	}

@PostMapping("/Student/find")
public Student getStudentById(@RequestBody int id) {
	Optional<Student> stud=repository.findById(id);
	if(stud.isPresent()) {
		return stud.get();
		
	}
	else {
		return null;
		
	}
}
}
