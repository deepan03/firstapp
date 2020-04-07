package com.firstapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "studentMarks")
public class MarksPojo {
	@Id
	@GeneratedValue
	private int id;
	private String subject;
	private int marks;
	public MarksPojo(int id, String subject, int marks) {
		super();
		this.id = id;
		this.subject = subject;
		this.marks = marks;
	}
	public MarksPojo() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentMarksPojo [id=" + id + ", subject=" + subject + ", marks=" + marks + "]";
	}
}
