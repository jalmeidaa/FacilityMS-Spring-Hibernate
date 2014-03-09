package com.facility.model.businessunit;

public interface BusinessUnit {
   public String getBusinessunitId();
   public void setBusinessunitId(String businessunit_id);
   public String getName();
   public void setName(String name);
   public String getAvailability();
   public void setAvailability(String availability);
   public String getStatus();
   public void setStatus(String status);
   public BusinessUnitDetails getBusinessunitdetails();
   public void setBusinessunitdetails(BusinessUnitDetails businessunitdetails);
  
}
