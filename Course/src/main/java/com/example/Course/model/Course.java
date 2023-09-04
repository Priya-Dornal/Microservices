package com.example.Course.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int courseId;
private String courseName;

@Column(name="courseFees")
private int courseFees;
private int courseDuration;
public Course(int courseId, String courseName, int courseFees, int courseDuration) {
	super();
	this.courseId = courseId;
	this.courseName = courseName;
	this.courseFees = courseFees;
	this.courseDuration = courseDuration;
}

public Course() {}

public int getCourseId() {
	return courseId;
}

public void setCourseId(int courseId) {
	this.courseId = courseId;
}

public String getCourseName() {
	return courseName;
}

public void setCourseName(String courseName) {
	this.courseName = courseName;
}

public int getCourseFees() {
	return courseFees;
}

public void setCourseFees(int courseFees) {
	this.courseFees = courseFees;
}

public int getCourseDuration() {
	return courseDuration;
}

public void setCourseDuration(int courseDuration) {
	this.courseDuration = courseDuration;
}


}
