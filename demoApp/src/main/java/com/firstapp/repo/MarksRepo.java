package com.firstapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstapp.entity.MarksPojo;

public interface MarksRepo extends JpaRepository<MarksPojo, Integer> {

}
