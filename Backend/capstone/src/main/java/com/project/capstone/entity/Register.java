package com.project.capstone.entity;

import java.util.Arrays;

import javax.persistence.Lob;

public class Register {

	private int id;
	private int customerId;
	private String email;
	private String name;
	private String picdata;
	private String role;
    @Lob
    private byte[] pic;
    
    
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPicdata() {
		return picdata;
	}
	public void setPicdata(String picdata) {
		this.picdata = picdata;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public byte[] getPic() {
		return pic;
	}
	public void setPic(byte[] pic) {
		this.pic = pic;
	}
	@Override
	public String toString() {
		return "Register [id=" + id + ", customerId=" + customerId + ", email=" + email + ", name=" + name
				+ ", picdata=" + picdata + ", role=" + role + ", pic=" + Arrays.toString(pic) + "]";
	}

	
}
