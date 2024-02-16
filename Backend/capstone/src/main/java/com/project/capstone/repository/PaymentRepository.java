package com.project.capstone.repository;

import java.beans.JavaBean;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.capstone.entity.PaymentEntity;

@Repository
@JavaBean
public interface PaymentRepository  extends JpaRepository<PaymentEntity, Integer>{
	List<PaymentEntity> findByCustomerId(int customerId);
}