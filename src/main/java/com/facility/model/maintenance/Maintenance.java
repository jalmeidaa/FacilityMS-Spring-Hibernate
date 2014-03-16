package com.facility.model.maintenance;

import java.util.List;

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
	public List<MaintenanceOrder> getMaintenanceorder();
	public void setMaintenance(List<MaintenanceOrder> maintenanceOrders);
	public List<MaintenanceRequest> getMaintenancerequest();
	public void setMaintenancerequest(List<MaintenanceRequest> maintenanceRequests);
	public void addMaintReq(MaintenanceRequest maintenancerequest);
	public void orderMaint();
	public void statusMaint();
	
	
}
