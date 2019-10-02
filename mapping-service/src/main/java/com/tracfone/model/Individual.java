package com.tracfone.model;

public class Individual {
	
	private double id;
	private String firstName;
	private String lastName;
	
	
	public Individual() {
	}
	
	public double getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Individual [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
