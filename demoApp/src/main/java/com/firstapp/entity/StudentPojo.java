package com.firstapp.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class StudentPojo {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String standard;
	private int totalmarks;
	
	@OneToMany(targetEntity = MarksPojo.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id", referencedColumnName = "id")
	private List<MarksPojo> studentMarks;

	public StudentPojo(int id, String name, String standard, int totalmarks, List<MarksPojo> studentMarks) {
		super();
		this.id = id;
		this.name = name;
		this.standard = standard;
		this.totalmarks = totalmarks;
		this.studentMarks = studentMarks;
	}

	public List<MarksPojo> getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(List<MarksPojo> studentMarks) {
		this.studentMarks = studentMarks;
	}

	public StudentPojo(int id, String name, String standard, int totalmarks) {
		super();
		this.id = id;
		this.name = name;
		this.standard = standard;
		this.totalmarks = totalmarks;
	}

	public StudentPojo() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public int getTotalmarks() {
		return totalmarks;
	}

	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}

	@Override
	public String toString() {
		return "StudentPojo [id=" + id + ", name=" + name + ", standard=" + standard + ", totalmarks=" + totalmarks
				+ ", studentMarks=" + studentMarks + "]";
	}

}
