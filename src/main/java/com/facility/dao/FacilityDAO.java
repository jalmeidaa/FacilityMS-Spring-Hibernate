package com.facility.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.facility.model.facility.*;

public class FacilityDAO{
	public FacilityDAO(){}
	public Facility getFacility(String id){
	 try { 		
	    	//Get Facility
	    	Statement st = DBHelper.getConnection().createStatement();
	    	String selectFacilityQuery = "SELECT id, name, address, contact, date FROM Facility WHERE FacilityID = '" + id + "'";

	    	ResultSet facRS = st.executeQuery(selectFacilityQuery);      
	    	System.out.println("FacilityDAO: *************** Query " + selectFacilityQuery);
	    	
	      //Get Facility
 	  Facility facility = new FacilityImp();
	      while ( facRS.next() ) {
	    	  facility.setId(facRS.getString("id"));
	    	  facility.setName(facRS.getString("name"));
	    	  facility.setAddress(facRS.getString("address"));
	    	  facility.setContact(facRS.getString("contact"));
	    	  facility.setDate(facRS.getString("date"));
	    	  
	      }
	      //close to manage resources
	      facRS.close();
	 
	      //Get FacilityDetails
	      String selectFacilityDetailsQuery = "SELECT facilitydetail_id, descritpion, note FROM FacilityDetails WHERE FacilityID = '" + id + "'";
	      ResultSet fdRS = st.executeQuery(selectFacilityDetailsQuery);
	      FacilityDetails facilitydetails = new FacilityDetailsImp();
    	  
    	  System.out.println("FacilityDAO: *************** Query " + selectFacilityDetailsQuery);
    	  
	      while (fdRS.next() ) {
	    	  facilitydetails.setFdetailID(fdRS.getString("facilitydetail_id"));
	    	  facilitydetails.setDescription(fdRS.getString("decription"));
	    	  facilitydetails.setNote(fdRS.getString("note"));
	    	  
	      }
	      
	      facility.setFacilityDetails(facilitydetails);
	      //close to manage resources
	      fdRS.close();
	      
	      //Get FacilityUse
	      String selectFacilityUseQuery = "SELECT faciuse_id, price, str_date, end_date, note FROM FacilityUse WHERE FacilityID = '" + id + "'";
	      ResultSet fuRS = st.executeQuery(selectFacilityUseQuery);
    	 FacilityUse facilityuse = new FacilityUseImp();
    	  
    	  System.out.println("FacilityDAO: *************** Query " + selectFacilityUseQuery);
    	  
	      while (fuRS.next() ) {
	    	  facilityuse.setFaciuseID(fuRS.getString("faciuse_id"));
	    	  facilityuse.setPrice(fuRS.getString("price"));
	    	  facilityuse.setStrtdate(fuRS.getString("str_date"));
	    	  facilityuse.setEnddate(fuRS.getString("end_date"));
	    	  facilityuse.setNote(fuRS.getString("note"));
	    	  
	      }
	      
	      facility.setFacilityUse(facilityuse);
	      //close to manage resources
	      fuRS.close();
	      
	      return facility;
	    }	    
	    catch (SQLException se) {
	      System.err.println("FacilityDAO: Threw a SQLException retrieving the customer object.");
	      System.err.println(se.getMessage());
	      se.printStackTrace();
	    }
	    
	    return null;
	  }
	public void addFacility(Facility fac) {
		Connection con = DBHelper.getConnection();
        PreparedStatement facPst = null;
        PreparedStatement fdPst = null;
        PreparedStatement fuPst = null;

        try {
        	//Insert the Facility object
            String facStm = "INSERT INTO Facility(FacilityID, name, address, contact, date) VALUES(?, ?, ?, ?, ?)";
            facPst = con.prepareStatement(facStm);
            facPst.setString(1, fac.getId());
            facPst.setString(2, fac.getName());       
            facPst.setString(3, fac.getAddress());
            facPst.setString(4, fac.getContact());
            facPst.setString(5, fac.getDate());
            facPst.executeUpdate();
            
          //Insert the Facility Details object
            String fdStm = "INSERT INTO FacilityDetails(facilitydetail_id, descritpion, note) VALUES(?, ?, ?)";
            fdPst = con.prepareStatement(fdStm);
            fdPst.setString(1, fac.getId());
            fdPst.setString(2, fac.getFacilityDetails().getFdetailID());  
            fdPst.setString(3, fac.getFacilityDetails().getDescription());       
            fdPst.setString(4, fac.getFacilityDetails().getNote());  
            fdPst.executeUpdate();
            
          //Insert the Facility Use object
            String fuStm = "INSERT INTO FacilityUse(faciuse_id, price, str_date, end_date, note) VALUES(?, ?, ?, ?, ?)";
            fuPst = con.prepareStatement(fuStm);
            fuPst.setString(1, fac.getId());
            fuPst.setString(2, fac.getFacilityUse().getFaciuseID());  
            fuPst.setString(3, fac.getFacilityUse().getPrice());       
            fuPst.setString(4, fac.getFacilityUse().getStrtdate());  
            fuPst.setString(5, fac.getFacilityUse().getEnddate());  
            fuPst.setString(6, fac.getFacilityUse().getNote());      
            fuPst.executeUpdate();
        } catch (SQLException ex) {

        } finally {

            try {
                if (fdPst != null && fuPst != null) {
                	fdPst.close();
                	fuPst.close();
                	facPst.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {
      	      System.err.println("CustomerDAO: Threw a SQLException saving the customer object.");
    	      System.err.println(ex.getMessage());
            }
        }
    }
}

 