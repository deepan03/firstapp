package com.firstapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.firstapp.dto.StudentMarkRequest;
import com.firstapp.entity.StudentPojo;
import com.firstapp.repo.StudentRepo;

@RestController
public class StudentMarksController {
	
	@Autowired
	private StudentRepo studentRepo;
	
	@RequestMapping(method = RequestMethod.POST, value = "/addstudentmarks")
	public void addStudentMarks(@RequestBody StudentMarkRequest marks) {
		studentRepo.save(marks.getStudents());
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/getstudentmarks")
	public List<StudentPojo> getStudentMarks(){
		return studentRepo.findAll();
	}
}
