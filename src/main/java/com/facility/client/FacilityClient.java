package com.facility.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.facility.model.businessunit.BusinessUnit;
import com.facility.model.businessunit.BusinessUnitDetails;
import com.facility.model.facility.Facility;
import com.facility.model.facility.FacilityDetails;
import com.facility.model.facility.FacilityUse;
import com.facility.model.service.FacilityService;


public class FacilityClient 
{
    public static void main( String[] args )throws Exception{
    	
    
    ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
    System.out.println("***************** Application Context instantiated! ******************");
    
    FacilityService facilityService = (FacilityService) context.getBean("facilityService");
    
    Facility facility = facilityService.getFacility();
      facility.setId("0001");
	  facility.setName("Loyola");
	  facility.setAddress("Chicago");
	  facility.setContact("3123121234");
	  facility.setDate("10");
	  
	  
	 FacilityDetails facilityDetails = facility.getFacilityDetails();
	  facilityDetails.setFdetailID("00011");
	  facilityDetails.setDescription("Normal");
	  facilityDetails.setNote("Ready");
	  
	 FacilityUse facilityUse = facility.getFacilityUse();
	  facilityUse.setFaciuseID("000111");
	  facilityUse.setPrice("999");
	  facilityUse.setStrtdate("1");
	  facilityUse.setEnddate("31");
	  facilityUse.setNote("Booked");
	  
	  //  BusinessUnit businessunit = facility.getBusinessUnit();
	  
	  
	  
	  /**********************************************************************/
	//  BusinessUnit businessunit = (BusinessUnit) context.getBean("businessunit");
	  
	 // businessunit.setBusinessunitId("1000-22");
	 /* businessunit.setName("2Star");
	  *businessunit.setStatus("Ready");
	  *businessunit.setAvailability("Yes");
	  *  
	  *
	  *BusinessUnitDetails businessunitdetails = businessunit.getBusinessunitdetails();
	 *
	  *businessunitdetails.setBusiUnitDetailId("123");
	  *businessunitdetails.setDescription("Spacious");
	  *businessunitdetails.setFeatures("Included");
	  */
	 System.out.println("Facility:\t\t\t\t" +  facility.getName() + " " + facility.getAddress() + " "+ facility.getContact() + " "+ facility.getDate() + "\n" );
	System.out.println("FacilityDetails:\t\t\t\t" + facilityDetails.getDescription() + "" + facilityDetails.getNote() + "\n");
	 System.out.println("FacilityUse:\t\t\t\t" + facilityUse.getPrice() + "" + facilityUse.getStrtdate() + "" + facilityUse.getEnddate() + "" + facilityUse.getNote() + "\n");
	 
    }
}
