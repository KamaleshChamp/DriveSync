package com.project.capstone.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.capstone.entity.QuestionEntity;
import com.project.capstone.repository.QuestionRepository;

@Service
public class ForumService {
	
	@Autowired
	private QuestionRepository questionrepo;

	 
	public List<QuestionEntity> getForum() {

		List<QuestionEntity> question = questionrepo.findAll();
		return question;
	}
	public List<QuestionEntity> getForumById(int id){
		List<QuestionEntity> question = questionrepo.findAll();
		return question.stream().filter(e -> e.getUserId()==id).toList();
	}

}
