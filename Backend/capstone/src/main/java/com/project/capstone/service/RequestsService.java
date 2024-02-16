package com.project.capstone.service;

import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.capstone.entity.RequestsEntity;
import com.project.capstone.repository.RequestsRepository;

@Service
public class RequestsService {
	
	@Autowired
	RequestsRepository requestsrepo;


    public List<RequestsEntity> getRequests(int id) {
    	List<RequestsEntity> req = requestsrepo.findAll();
    	Collections.reverse(req);
        return req.stream().filter(e -> e.getCustomerId()==id).toList();
        }
    
    public List<RequestsEntity> getRequestReceived(int id) {
    	List<RequestsEntity> req = requestsrepo.findAll();
        Collections.reverse(req);
        return req.stream().filter(e -> e.getServiceCenterId()==id).toList();
        }

}


