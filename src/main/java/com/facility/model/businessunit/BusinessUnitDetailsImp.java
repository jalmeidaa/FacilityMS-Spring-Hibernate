package com.facility.model.businessunit;

public class BusinessUnitDetailsImp implements BusinessUnitDetails {
	private String busiunitdetail_id;
	private String description;
	private String features;
	
	public BusinessUnitDetailsImp(){
	}

	public String getBusiUnitDetailId() {
		return busiunitdetail_id;
	}

	public void setBusiUnitDetailId(String busiunitdetail_id) {
		this.busiunitdetail_id = busiunitdetail_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}
}
