package com.project.capstone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.capstone.entity.FeedbackEntity;
import com.project.capstone.repository.FeedbackRepository;

@Service
public class FeedbackService {
	@Autowired
	FeedbackRepository feedbackrepo;

    public List<FeedbackEntity> getFeedback(int id) {
    	List<FeedbackEntity> req = feedbackrepo.findAll();
    	return req.stream().filter(e -> e.getServiceCenterId()==id).toList();
    }
}
