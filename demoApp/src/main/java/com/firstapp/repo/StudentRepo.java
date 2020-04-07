package com.firstapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstapp.entity.StudentPojo;

public interface StudentRepo extends JpaRepository<StudentPojo, Integer>{

	List<StudentPojo> findByName(String name);
}
