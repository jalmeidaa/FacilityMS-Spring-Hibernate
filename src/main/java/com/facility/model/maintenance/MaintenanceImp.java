package com.facility.model.maintenance;



public class MaintenanceImp implements Maintenance {
	private String maint_id;
	private String cost;
	private String strt_date;
	private String end_date;
	private String status;
	private String note;
	private MaintenanceOrder maintenanceorder;
	private MaintenanceRequest maintenancerequest;

	public MaintenanceImp(){	
	}

	public String getMaintID() {
		return maint_id;
	}

	public void setmaintID(String maint_id) {
		this.maint_id = maint_id;
	}


	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getStrtdate() {
		return strt_date;
	}

	public void setStrtdate(String strt_date) {
		this.strt_date = strt_date;
	}

	public String getEnddate() {
		return end_date;
	}

	public void setEnddate(String end_date) {
		this.end_date = end_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public MaintenanceOrder getMaintenanceorder() {
		return maintenanceorder;
	}

	public void setMaintenance(MaintenanceOrder maintenanceorder) {
		this.maintenanceorder = maintenanceorder;
	}

	public MaintenanceRequest getMaintenancerequest() {
		return maintenancerequest;
	}

	public void setMaintenancerequest(MaintenanceRequest maintenancerequest) {
		this.maintenancerequest = maintenancerequest;
	}

}
