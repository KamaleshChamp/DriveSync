package com.project.capstone.repository;

import java.beans.JavaBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.capstone.entity.RequestsEntity;

@Repository 
@JavaBean
public interface RequestsRepository extends JpaRepository<RequestsEntity, Integer>{

}

