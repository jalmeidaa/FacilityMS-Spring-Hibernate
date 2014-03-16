package com.facility.model.businessunit;

import java.util.List;


public class BusinessUnitImp implements BusinessUnit {
	private String businessunit_id;
	private String name;
	private String availability;
	private String status = "Open";
	private List<BusinessUnitDetails> businessunitDetails;
	
	
	public BusinessUnitImp(){
		
	}

	public String getBusinessunitId() {
		return businessunit_id;
	}

	public void setBusinessunitId(String businessunit_id) {
		this.businessunit_id = businessunit_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<BusinessUnitDetails> getBusinessunitdetails() {
		return businessunitDetails;
	}

	public void setBusinessunitdetails(List<BusinessUnitDetails> businessunitDetails) {
		this.businessunitDetails = businessunitDetails;
	}

	public void addUnit(BusinessUnitDetails businessunitDetail) {
		if(status.equals("Open")){
			businessunitDetails.add(businessunitDetail);// TODO Auto-generated method stub
		}else {
			throw new IllegalStateException("Can only add Unit in Open state.");
		}
	}

	public void removeUnit() {
	if(status.equals("Close")){
		status = "Close";
	}else {
		throw new IllegalStateException("Unit cannot be removed.");
	}
	}
	

	
}
