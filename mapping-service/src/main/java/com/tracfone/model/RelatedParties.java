package com.tracfone.model;

public class RelatedParties {
	
	private String roleType;
	private Party party;
	
	
	public RelatedParties() {
	}
	
	public RelatedParties(String roleType, Party party) {
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
	@Override
	public String toString() {
		return "RelatedParties [roleType=" + roleType + ", party=" + party + "]";
	}
	
	
	

}
