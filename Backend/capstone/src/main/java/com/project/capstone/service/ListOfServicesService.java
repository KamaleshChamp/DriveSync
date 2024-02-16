package com.project.capstone.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.capstone.entity.ListOfServicesEntity;
import com.project.capstone.repository.ListOfServicesRepository;
@Service
public class ListOfServicesService {
	@Autowired
	ListOfServicesRepository listofservicerepo;

    public List<ListOfServicesEntity> getList(int id) {
    	List<ListOfServicesEntity> req = listofservicerepo.findAll();
    	return req.stream().filter(e -> e.getServiceCenterId()==id).toList();
    }
}
