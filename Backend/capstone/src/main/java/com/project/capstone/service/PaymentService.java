package com.project.capstone.service;

import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.capstone.entity.PaymentEntity;
import com.project.capstone.repository.PaymentRepository;


@Service
public class PaymentService {
	
	@Autowired
	PaymentRepository paymentrepo;
	
    public List<PaymentEntity> getPayment(int id) {
    	List<PaymentEntity> req = paymentrepo.findAll();
    	Collections.reverse(req);
        return req.stream().filter(e -> e.getCustomerId()==id).toList();
        }
}
