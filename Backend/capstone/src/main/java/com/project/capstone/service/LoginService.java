package com.project.capstone.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.capstone.entity.Register;
import com.project.capstone.entity.RegistrationEntity;
import com.project.capstone.repository.RegistrationRepository;

@Service
public class LoginService {

	@Autowired
	RegistrationRepository registartionrepo;
	
    

	
    public Register login(RegistrationEntity registration) {
    	RegistrationEntity req=registartionrepo.findByEmail(registration.getEmail());
    	if(req!=null && req.getPassword().equals(registration.getPassword())) {
    		Register register = new Register();
    		register.setCustomerId(req.getCustomerId());
        	register.setName(req.getFirstName());
        	register.setEmail(req.getEmail());
        	register.setRole(req.getRole());

        	System.out.println(register);
    		return register;}
    	else {
    		Register register = new Register();
    		register.setRole("not found");
    		return register;
    	}
    }
	
}