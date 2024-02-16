package com.project.capstone.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RequestsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	private int customerId;
	private int serviceCenterId;
	private String serviceCenterName;
	private String serviceType;
	private int serviceAmount;
	private String serviceStatus;
	private LocalDateTime date;
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
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "RequestsEntity [id=" + id + ", customerId=" + customerId + ", serviceCenterId=" + serviceCenterId
				+ ", serviceCenterName=" + serviceCenterName + ", serviceType=" + serviceType + ", serviceAmount="
				+ serviceAmount + ", serviceStatus=" + serviceStatus + ", date=" + date + "]";
	}
	
	

}
