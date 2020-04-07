package com.firstapp.dto;

import com.firstapp.entity.StudentPojo;

public class StudentMarkRequest {
	
	private StudentPojo students;

	public StudentPojo getStudents() {
		return students;
	}

	public void setStudents(StudentPojo students) {
		this.students = students;
	}

	public StudentMarkRequest(StudentPojo students) {
		super();
		this.students = students;
	}

	public StudentMarkRequest() {
		super();
	}

	@Override
	public String toString() {
		return "StudentMarkRequest [students=" + students + "]";
	}
}
