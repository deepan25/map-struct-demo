package com.tracfone.model;

public class Resources {
	
	private String roleType;
	private Party party;
	
	public Resources() {
	}
	
	public Resources(String roleType, Party party) {
		this.roleType = roleType;
		this.party = party;
	}

	public String getRoleType() {
		return roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	public Party getParty() {
		return party;
	}
	public void setParty(Party party) {
		this.party = party;
	}
	
	

}
