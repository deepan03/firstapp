package com.firstapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstapp.entity.StudentPojo;
import com.firstapp.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo studentRepo;

	
	public List<StudentPojo> getAllStudents(){
		return studentRepo.findAll();
	}
	
	public StudentPojo getStudentDetailById(int id){
		return studentRepo.findById(id).orElse(null);
	}
	
	public List<StudentPojo> getStudentDetailByname(String name){
		return studentRepo.findByName(name);
	}
	
	public void addStudent(StudentPojo student) {
		studentRepo.save(student);
	}
	
	public void addStudents(List<StudentPojo> students) {
		studentRepo.saveAll(students);
	}

	public void updateStudent(StudentPojo student) {
		StudentPojo existingStudent = studentRepo.findById(student.getId()).orElse(null);
		existingStudent.setName(student.getName());
		existingStudent.setStandard(student.getStandard());
		existingStudent.setTotalmarks(student.getTotalmarks());
	}

	public void deleteStudent(int id) {
		studentRepo.deleteById(id);
	}

}
