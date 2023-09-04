package com.example.Course.model;


public class Student {

private int studId;
private String studName;

private String grade;
private int age;
public Student(int studId, String studName, String grade, int age) {
	super();
	this.studId = studId;
	this.studName = studName;
	this.grade = grade;
	this.age = age;
}
public int getStudId() {
	return studId;
}
public void setStudId(int studId) {
	this.studId = studId;
}
public String getStudName() {
	return studName;
}
public void setStudName(String studName) {
	this.studName = studName;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public Student() {
	
	
}
}
