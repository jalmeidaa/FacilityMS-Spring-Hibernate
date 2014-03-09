package com.facility.model.maintenance;

public class MaintenanceRequestImp implements MaintenanceRequest {
	private String id;
	private String note;
	private String req_date;
	
	public MaintenanceRequestImp() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getReqdate() {
		return req_date;
	}

	public void setReqdate(String req_date) {
		this.req_date = req_date;
	}

	
}
