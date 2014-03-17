package com.facility.model.facility;

import java.util.List;

import com.facility.model.businessunit.BusinessUnit;
import com.facility.model.maintenance.Maintenance;

public  class FacilityImp implements Facility {
	 private String Id;
	 private String name;
	 private String address;
	 private String contact;
	 private String date;
	 private FacilityDetails facilityDetails;
	 private FacilityUse facilityUse;
	 private List<Maintenance> maintenances;
	 private List<BusinessUnit> businessunits;
	 
	 public FacilityImp(){
	 }
	 public String getId() {
		 return Id;
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
	
	public void setId(String Id) {
		this.Id = Id;
		
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
	
	public void addMaintenance(Maintenance maintenance) {
		maintenances.add(maintenance);
		
	}
	public void addBusinessUnit(BusinessUnit businessunit) {
		businessunits.add(businessunit);
		
	}
	public List<Maintenance> getMaintenances() {
		return maintenances;
	}
	public void setMaintenances(List<Maintenance> maintenances) {
		this.maintenances = maintenances;
		
	}
	public List<BusinessUnit> getBusinessunits() {
		return businessunits;
	}
	public void setBusinessunits(List<BusinessUnit> businessunits) {
		this.businessunits = businessunits;
		
	}
	
	}
