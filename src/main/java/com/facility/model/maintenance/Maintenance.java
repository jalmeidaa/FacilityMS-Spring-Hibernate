package com.facility.model.maintenance;



public interface Maintenance {
	public String getMaintID();
	public void setmaintID(String maint_id);
	public String getCost();
	public void setCost(String cost); 
	public String getStrtdate();
	public void setStrtdate(String strt_date);
	public String getEnddate();
	public void setEnddate(String end_date);
	public String getStatus();
	public void setStatus(String status);
	public String getNote();
	public void setNote(String note);
	public MaintenanceOrder getMaintenanceorder();
	public void setMaintenance(MaintenanceOrder maintenanceorder);
	public MaintenanceRequest getMaintenancerequest();
	public void setMaintenancerequest(MaintenanceRequest maintenancerequest);
}
