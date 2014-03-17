package com.facility.model.maintenance;

import java.util.List;


public class MaintenanceImp implements Maintenance {
	private String maint_id;
	private String cost;
	private String strt_date;
	private String end_date;
	private String status = "Open";
	private String note;
	private List<MaintenanceOrder> maintenanceOrders;
	private List<MaintenanceRequest> maintenanceRequests;

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

	public List<MaintenanceOrder> getMaintenanceOrders() {
		return maintenanceOrders;
	}

	public void setMaintenanceOrders(List<MaintenanceOrder> maintenanceOrders) {
		this.maintenanceOrders = maintenanceOrders;
	}

	public List<MaintenanceRequest> getMaintenanceRequests() {
		return maintenanceRequests;
	}

	public void setMaintenanceRequests(List<MaintenanceRequest> maintenanceRequests) {
		this.maintenanceRequests = maintenanceRequests;
	}

	public void addMaintReq(MaintenanceRequest maintenancerequest) {
		if(status.equals("Open")){
			maintenanceRequests.add(maintenancerequest);// TODO Auto-generated method stub
		}
		else {
			throw new IllegalStateException("Can only add request in Open status.");
		}
	}

	public void orderMaint() {
		if(status.equals("Ordered")){
			status = "Ordered";// TODO Auto-generated method stub
		}else {
			throw new IllegalStateException("Cannot  order in this status.");
		}
	}

	public void statusMaint() {
		if(status.equals("Close")){
			status = "Complete";// TODO Auto-generated method stub
		}else {
			throw new IllegalStateException("Incomplete Order");
		}
		
	}

}
