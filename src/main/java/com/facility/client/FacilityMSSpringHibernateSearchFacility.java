package com.facility.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.facility.model.facility.Facility;
import com.facility.model.facility.FacilityDetails;
import com.facility.model.service.FacilityService;

public class FacilityMSSpringHibernateSearchFacility {
	public static void main (String args[]) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("***************** Application Context instantiated! ******************");

        //Spring to inject the right object implementation in CustomerService for customer using Setter Injection
        //Also, bootstrapping the CustomerService instantiation using factory
        FacilityService facilityService = (FacilityService) context.getBean("facilityService");
	    System.out.println("*************** Creating Facility service object *************************"); 
	    
        System.out.println("*************** SEARCH EXAMPLE *************************");
 
        //Find a facility if already exists; if not, create a new one.
        Facility searchedFacility = facilityService.findFacilityById("001"); 
        System.out.println("Searched facility information .......>>");
        System.out.println("\tName: \t\t\t" + searchedFacility.getName() + "\n\t\t\t\t" + searchedFacility.getAddress() + "\n\t\t\t\t" + searchedFacility.getContact() +"\n\t\t\t\t" + searchedFacility.getDate() + "\n");
        
        FacilityDetails facDetails = searchedFacility.getFacilityDetails();
        //FacilityDetails facDetails = facilityService.findFacilityDetails(searchedFacility.getId());
        System.out.println("\tFacility Details:\t" + facDetails.getFdetail_id() + "\n\t\t\t\t" + facDetails.getDescription() + 
        		"\n\t\t\t\t" + facDetails.getNote() +	"\n");  
      
}
}
