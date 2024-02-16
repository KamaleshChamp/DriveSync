package com.project.capstone.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AnswerEntity {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "answer")
    private String answer;

    @Column(name = "userId")
    private int userId;
    
    @Column(name = "time")
    private LocalDateTime time;

    public AnswerEntity() {}

    public AnswerEntity( String name, String answer, int userId, LocalDateTime time) {
    	this.name = name;
    	this.answer = answer;
    	this.userId = userId;
    	this.time = time;
    }

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

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "AnswerEntity [id=" + id + ", name=" + name + ", answer=" + answer + ", userId=" + userId + ", time="
				+ time + "]";
	}
	
 
}