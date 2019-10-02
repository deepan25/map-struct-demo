package com.tracfone.dto;

/**
 * @author Marlabs
 *
 */
public class ServiceDTO {
	
	public String partyId;
	public String language;
	public double customerId;
	public String firstName;
	public String lastName;
	
	public double getCustomerId() {
		return customerId;
	}
	public void setCustomerId(double customerId) {
		this.customerId = customerId;
	}
	public String getPartyId() {
		return partyId;
	}
	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
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
		return "ServiceDTO [partyId=" + partyId + ", language=" + language + ", customerId=" + customerId
				+ ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
