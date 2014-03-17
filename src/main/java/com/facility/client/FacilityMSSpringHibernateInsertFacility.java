package com.facility.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.facility.model.facility.Facility;
import com.facility.model.facility.FacilityDetails;
import com.facility.model.facility.FacilityUse;
import com.facility.model.service.FacilityService;


public class FacilityMSSpringHibernateInsertFacility {
public static void main (String args[]) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("***************** Application Context instantiated! ******************");
        FacilityService facilityService = (FacilityService) context.getBean("facilityService");
        
        System.out.println("*************** INSERT EXAMPLE *************************");
        System.out.println("*************** This example involves Instantiating and Saving Facility ***********************");
        
        System.out.println("*************** Instantiating Facility ***********************");
        Facility facility = (Facility) context.getBean("facility");
		facility.setId("001");
        facility.setName("Loyola");
        facility.setAddress("Chicago");
        facility.setContact("312-123-4765");
        facility.setDate("1870");
        
        //Spring to inject the right object implementation
        FacilityDetails facilityDetails = facility.getFacilityDetails();
        facilityDetails.setId(facility.getId());
        facilityDetails.setFdetail_id("LUC123");
        facilityDetails.setDescription("University");
        facilityDetails.setNote("Private");
        
        FacilityUse facilityUse = facility.getFacilityUse();
        facilityUse.setId(facility.getId());
        facilityUse.setFaciuse_id("LUC009");
        facilityUse.setPrice("800");
        facilityUse.setStr_date("August");
        facilityUse.setEnd_date("September");
        facilityUse.setNote("Contact Office");
                     
        System.out.println("*************** Saving Facility ***********************");
        facilityService.addFacility(facility);
        System.out.println("*************** Facility Inserted *************************");
	}
}
