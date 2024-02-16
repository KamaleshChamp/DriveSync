package com.project.capstone.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ListOfServicesEntity {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // sequence
	private int id;
	private int serviceCenterId;
	private String serviceCenterName;
	private String serviceType;
	private int serviceAmount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "ListOfServicesEntity [id=" + id + ", serviceCenterId=" + serviceCenterId + ", serviceCenterName="
				+ serviceCenterName + ", serviceType=" + serviceType + ", serviceAmount=" + serviceAmount + "]";
	}
	

	
}
