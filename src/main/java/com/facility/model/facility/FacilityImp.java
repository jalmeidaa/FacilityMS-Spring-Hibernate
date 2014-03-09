package com.facility.model.facility;

public  class FacilityImp implements Facility {
	 private String id;
	 private String name;
	 private String address;
	 private String contact;
	 private String date;
	 private FacilityDetails facilityDetails;
	 private FacilityUse facilityUse;
	 
	 public FacilityImp(){
	 }
	 public String getId() {
		 return id;
		}
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getContact() {
		return contact;
	}
	public String getDate() {
		return date;
		}
	
	public void setId(String id) {
		this.id = id;
		
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public void setAddress(String address) {
		this.address = address;
		
	}
	public void setContact(String contact) {
		this.contact = contact;
		
	}
	public void setDate(String date) {
		this.date = date;
		
	}
	public FacilityDetails getFacilityDetails() {
		return facilityDetails;
	}
	public void setFacilityDetails(FacilityDetails facilityDetails) {
		this.facilityDetails = facilityDetails;
	}
	public FacilityUse getFacilityUse() {
		return facilityUse;
	}
	public void setFacilityUse(FacilityUse facilityUse) {
		this.facilityUse = facilityUse;
	}
	
	}
