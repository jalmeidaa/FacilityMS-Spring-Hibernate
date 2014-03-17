package com.facility.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.facility.model.facility.Facility;
import com.facility.model.facility.FacilityDetails;
import com.facility.model.service.FacilityService;


public class FacilityMSSpringHibernateDeleteFacility {
	public static void main (String args[]) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
		System.out.println("***************** Application Context instantiated! ******************");

		//Spring to inject the right object implementation in FacilityService for customer using Setter Injection
		//Also, bootstrapping the FacilityService instantiation using factory
		FacilityService facilityService = (FacilityService) context.getBean("facilityService");
		System.out.println("*************** Creating Facility service object *************************"); 
    
		System.out.println("*************** DELETE EXAMPLE *************************");

		//Find a facility if already exists; if not, create a new one.
		Facility searchedFacility = facilityService.findFacilityById("001"); 
		System.out.println("*************** Facility to be deleted *************************");
		System.out.println("\tName: \t\t\t" + searchedFacility.getName() + " " + searchedFacility.getAddress() + "\n");
        
        FacilityDetails facDetails = searchedFacility.getFacilityDetails();
        //FacilityDetails facDetails = facilityService.findFacilityDetails(searchedFacility.getId());
        System.out.println("\tFacility Details:\t" + facDetails.getFdetailId() + 
        		"\n\t\t\t\t" + facDetails.getNote() +	"\n");
        
        System.out.println("*************** Facility to be deleted *************************");
		facilityService.deleteFacility(searchedFacility);
		System.out.println("*************** Cutomer deleted *************************");
}
}
