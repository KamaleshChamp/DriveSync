package com.project.capstone.entity;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class QuestionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "question")
    private String question;
    
    @Column(name = "time")
    private LocalDateTime time;
    
    @Column(name = "userId")
    private int userId;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "question_id")
    private List<AnswerEntity> answerList;

    public QuestionEntity() {}
    
    
    
public QuestionEntity(int id, String name, String question, LocalDateTime time, int userId, List<AnswerEntity> answerList) {
		this.id = id;
		this.name = name;
		this.question = question;
		this.time = time;
		this.userId = userId;
		this.answerList = answerList;
	}



//  public Owner(String name, String email) {
//  this.name = name;
//  this.email = email;
//}
    
    

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<AnswerEntity> getAnswerList() {
		return answerList;
	}

	public void setAnswerList(List<AnswerEntity> answerList) {
		this.answerList = answerList;
	}

	@Override
	public String toString() {
		return "Owner [id=" + id + ", name=" + name + ", question=" + question + ", time=" + time + ", userId=" + userId
				+ ", answerList=" + answerList + "]";
	}
    
    




}