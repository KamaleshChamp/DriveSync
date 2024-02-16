package com.project.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.capstone.entity.AnswerEntity;

public interface AnswerRepository extends JpaRepository<AnswerEntity, Integer> {
	
}