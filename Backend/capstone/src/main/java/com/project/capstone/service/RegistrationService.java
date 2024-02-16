package com.project.capstone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.capstone.entity.RegistrationEntity;
import com.project.capstone.repository.RegistrationRepository;

@Service
public class RegistrationService {
	@Autowired
	RegistrationRepository registrationrepo;

    public boolean getRegister(RegistrationEntity registrationentity) {
    	System.out.println(registrationentity);
    	if(registrationrepo.findByEmail(registrationentity.getEmail()) != null) {
    		return false;
    	}
    	else {
    		
    		registrationrepo.save(registrationentity);
      		return true;
    	}
    }
}