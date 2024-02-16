package com.project.capstone.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FeedbackEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	private int customerId;
	private int serviceCenterId;
	private String serviceCenterName;
	private String serviceType;
	private int serviceAmount;
	private String serviceStatus;
	private int starRating;
	private String comments;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getServiceCenterId() {
		return serviceCenterId;
	}
	public void setServiceCenterId(int serviceCenterId) {
		this.serviceCenterId = serviceCenterId;
	}
	public String getServiceCenterName() {
		return serviceCenterName;
	}
	public void setServiceCenterName(String serviceCenterName) {
		this.serviceCenterName = serviceCenterName;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public int getServiceAmount() {
		return serviceAmount;
	}
	public void setServiceAmount(int serviceAmount) {
		this.serviceAmount = serviceAmount;
	}
	public String getServiceStatus() {
		return serviceStatus;
	}
	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}
	public int getStarRating() {
		return starRating;
	}
	public void setStarRating(int starRating) {
		this.starRating = starRating;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "FeedbackEntity [id=" + id + ", customerId=" + customerId + ", serviceCenterId=" + serviceCenterId
				+ ", serviceCenterName=" + serviceCenterName + ", serviceType=" + serviceType + ", serviceAmount="
				+ serviceAmount + ", serviceStatus=" + serviceStatus + ", starRating=" + starRating + ", comments="
				+ comments + "]";
	}
	

	
	
}
