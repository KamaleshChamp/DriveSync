package com.project.capstone.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.capstone.entity.QuestionEntity;
import com.project.capstone.repository.QuestionRepository;
import com.project.capstone.service.ForumService;


@RestController
@RequestMapping("/api")
public class ForumController {
	
	Logger logger = org.slf4j.LoggerFactory.getLogger(ForumController.class);

    @Autowired
    private QuestionRepository questionRepo;
    @Autowired
    private ForumService forumservice;


    @PostMapping("/postForum")
    public ResponseEntity<List<QuestionEntity>> saveForum(@RequestBody QuestionEntity questionEntity) {
//    	String trac = "Post Forum Data";
//    	logger.trace(trac, questionEntity);
        try {
        	String trac = "Post Forum Data";
        	logger.trace(trac, questionEntity);
            questionRepo.save(questionEntity);
            return new ResponseEntity<List<QuestionEntity>>(HttpStatus.ACCEPTED);
        } catch (Exception e) {
        	logger.trace("posting question throws error");
            return new ResponseEntity<List<QuestionEntity>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getForumAll")
    public ResponseEntity<List<QuestionEntity>> getForum() {
        try {
            return new ResponseEntity<List<QuestionEntity>>(forumservice.getForum(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<List<QuestionEntity>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getForum/{id}")
    public ResponseEntity<List<QuestionEntity>> getOwner(@PathVariable(name = "id") int id) {
        try {
            return new ResponseEntity<List<QuestionEntity>>(forumservice.getForumById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<List<QuestionEntity>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
