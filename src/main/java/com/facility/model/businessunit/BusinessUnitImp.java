package com.facility.model.businessunit;


public class BusinessUnitImp implements BusinessUnit {
	private String businessunit_id;
	private String name;
	private String availability;
	private String status;
	private BusinessUnitDetails businessunitdetails;
	
	
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

	public BusinessUnitDetails getBusinessunitdetails() {
		return businessunitdetails;
	}

	public void setBusinessunitdetails(BusinessUnitDetails businessunitdetails) {
		this.businessunitdetails = businessunitdetails;
	}
	

	
}
