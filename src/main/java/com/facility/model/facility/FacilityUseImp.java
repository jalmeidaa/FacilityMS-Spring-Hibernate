package com.facility.model.facility;



public class FacilityUseImp implements FacilityUse {
	private String faciuse_id;	
	private String price;
	private String str_date;
	private String end_date;
	private String note;
	

	public FacilityUseImp(){
	}

	public String getFaciuseID() {
		return faciuse_id;
	}

	public void setFaciuseID(String faciuse_id) {
		this.faciuse_id = faciuse_id;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getStrtdate() {
		return str_date;
	}

	public void setStrtdate(String str_date) {
		this.str_date = str_date;
	}

	public String getEnddate() {
		return end_date;
	}

	public void setEnddate(String end_date) {
		this.end_date = end_date;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}
