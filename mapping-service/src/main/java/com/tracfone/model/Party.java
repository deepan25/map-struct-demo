package com.tracfone.model;

public class Party {

	private String partyId;
	private String language;
	private Individual customer; 
	private String partyExtension;
	
	public Party() {
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
	public Individual getCustomer() {
		return customer;
	}
	public void setCustomer(Individual customer) {
		this.customer = customer;
	}
	public String getPartyExtension() {
		return partyExtension;
	}
	public void setPartyExtension(String partyExtension) {
		this.partyExtension = partyExtension;
	}
	@Override
	public String toString() {
		return "Party [partyId=" + partyId + ", language=" + language + ", customer=" + customer + ", partyExtension="
				+ partyExtension + "]";
	}
	
	
}
