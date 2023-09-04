package com.example.Course.intercom;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Course.model.Student;


@FeignClient(name="Student",url="http://localhost:8081")
public interface StudentClient {

	@PostMapping(value="/home/Student/find",consumes="application/json")
	Student getStudent(@RequestBody int studId);
}
