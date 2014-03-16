package com.facility.model.facility;

import java.util.List;

import com.facility.model.businessunit.BusinessUnit;
import com.facility.model.maintenance.Maintenance;

public interface Facility {
	public String getId();
	public void setId(String id);
	public String getName();
	public void setName(String name);
	public String getAddress();
	public void setAddress(String address);
	public String getContact();
	public void setContact(String contact);
	public String getDate();
	public void setDate(String date);
	public FacilityDetails getFacilityDetails();
	public void setFacilityDetails(FacilityDetails facilityDetails);
	public FacilityUse getFacilityUse();
	public void setFacilityUse(FacilityUse facilityUse);
	public void addMaintenance(Maintenance maintenance);
	public void addBusinessUnit(BusinessUnit businessunit);
		
}
