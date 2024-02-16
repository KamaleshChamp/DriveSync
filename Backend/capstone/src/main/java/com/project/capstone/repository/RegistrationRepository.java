package com.project.capstone.repository;

import java.beans.JavaBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.capstone.entity.RegistrationEntity;

@Repository
@JavaBean
public interface RegistrationRepository extends JpaRepository<RegistrationEntity,Integer>{
	RegistrationEntity findByEmail(String email);
}
