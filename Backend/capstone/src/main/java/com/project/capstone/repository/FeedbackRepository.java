package com.project.capstone.repository;

import java.beans.JavaBean;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.capstone.entity.FeedbackEntity;

@Repository
@JavaBean
public interface FeedbackRepository  extends JpaRepository<FeedbackEntity, Integer>{

}
