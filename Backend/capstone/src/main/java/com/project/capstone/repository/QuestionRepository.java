package com.project.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.capstone.entity.QuestionEntity;

public interface QuestionRepository extends JpaRepository<QuestionEntity,Integer> {
}
