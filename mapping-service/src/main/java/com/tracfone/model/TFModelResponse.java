package com.tracfone.model;

public class TFModelResponse {
	
	private RelatedParties relatedParties;
	private Resources resources;
	
	public RelatedParties getRelatedParties() {
		return relatedParties;
	}
	public void setRelatedParties(RelatedParties relatedParties) {
		this.relatedParties = relatedParties;
	}
	public Resources getResources() {
		return resources;
	}
	public void setResources(Resources resources) {
		this.resources = resources;
	}
	@Override
	public String toString() {
		return "TFModelResponse [relatedParties=" + relatedParties + ", resources=" + resources + "]";
	}
	

}
