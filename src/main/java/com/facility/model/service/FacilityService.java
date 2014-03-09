package com.facility.model.service;

import com.facility.model.facility.Facility;


public class FacilityService {
	private Facility facility;
	
	public void setFacility(Facility facility) {
		this.facility = facility;
	}
	
	public Facility getFacility(){
		return facility;
	}
}
