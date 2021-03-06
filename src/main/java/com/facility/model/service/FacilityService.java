package com.facility.model.service;

import com.facility.dao.FacilityHibernateDAO;
import com.facility.model.facility.Facility;


public class FacilityService {
	//private Facility facility;
	private FacilityHibernateDAO facDAO = new FacilityHibernateDAO();
	/**
	public void setFacility(Facility facility) {
		this.facility = facility;
	}
	
	public Facility getFacility(){
		return facility;
	}
	**/
	public void addFacility(Facility facility){
		try {

			facDAO.addFacility(facility);
	    } catch (Exception se) {
	      System.err.println("FacilityService: Threw a Exception retrieving facility.");
	      System.err.println(se.getMessage());
	    }
	}
	public void deleteFacility(Facility facility) {
		
		try {
			facDAO.deleteFacility(facility);
	    } catch (Exception se) {
	      System.err.println("FacilityService: Threw a Exception deleting facility.");
	      System.err.println(se.getMessage());
	    }
}
	public Facility findFacilityById(String Id) {
		
		try {
			Facility facility = facDAO.retrieveFacility(Id);
	    	return facility;
	    } catch (Exception se) {
	      System.err.println("FacilityService: Threw a Exception retrieving facility.");
	      System.err.println(se.getMessage());
	    }
		return null;
	}
}
