package com.firstapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.firstapp.entity.StudentPojo;
import com.firstapp.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/students")
	public List<StudentPojo> getAllStudent() {
		return studentService.getAllStudents();
	}
	
	@RequestMapping("/students/{id}")
	public StudentPojo getStudentList(@PathVariable int id){
		return studentService.getStudentDetailById(id);
	}
	
	@RequestMapping("/studentbyname/{name}")
	public List<StudentPojo> getStudentList(@PathVariable String name){
		return studentService.getStudentDetailByname(name);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/student")
	public void addStudent(@RequestBody StudentPojo student) {
		studentService.addStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/students")
	public void addStudents(@RequestBody List<StudentPojo> student) {
		studentService.addStudents(student);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/student/{id}")
	public void updateStudent(@RequestBody StudentPojo student) {
		studentService.updateStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/student/{id}")
	public void deleteStudent(@PathVariable int id) {
		studentService.deleteStudent(id);
	}
}
