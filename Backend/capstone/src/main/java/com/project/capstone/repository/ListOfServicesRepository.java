package com.project.capstone.repository;

import java.beans.JavaBean;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.capstone.entity.ListOfServicesEntity;

@Repository
@JavaBean
public interface ListOfServicesRepository extends JpaRepository<ListOfServicesEntity, Integer>{

}
