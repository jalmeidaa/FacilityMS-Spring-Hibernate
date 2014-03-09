package com.facility.model.maintenance;


public class MaintenanceOrderImp implements MaintenanceOrder {
	private String id;
	private String ord_date;
	private String contact;
	private String note;

	public MaintenanceOrderImp(){
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrdDate() {
		return ord_date;
	}

	public void setOrdDate(String ord_date) {
		this.ord_date = ord_date;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}


	
}
