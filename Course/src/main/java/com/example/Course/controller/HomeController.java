package com.example.Course.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Course.intercom.StudentClient;
import com.example.Course.model.Course;
import com.example.Course.model.Student;
import com.example.Course.repository.CourseRepository;

@RestController
public class HomeController {

	@Autowired
	CourseRepository courserepo;
	
	@Autowired
	StudentClient studClient;
	
	@GetMapping("/service/stud/{studId}")
	public Student getStud(@PathVariable int studId) {
		return studClient.getStudent(studId);
	}
	
	@GetMapping("/Course")
	public List<Course> getCourse(){
	List<Course> couList=courserepo.findAll();
	return couList;
	}
	
@GetMapping("/Course/find/{id}")
//	public Student getStudentById(@RequestParam("id")int id)
	public Course getCourseById(@PathVariable("id")int id)
{
		
		Optional<Course> cou=courserepo.findById(id);
		if(cou.isPresent()) {
			return cou.get();
			
		}
		else {
			return null;
			
		}
	}

	
}
