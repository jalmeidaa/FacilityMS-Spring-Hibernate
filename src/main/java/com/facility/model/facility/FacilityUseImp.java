package com.facility.model.facility;



public class FacilityUseImp implements FacilityUse {
	private String id;
	private String faciuse_id;	
	private String price;
	private String str_date;
	private String end_date;
	private String note;
	

	public FacilityUseImp(){
	}

	public String getFaciuse_id() {
		return faciuse_id;
	}

	public void setFaciuse_id(String faciuse_id) {
		this.faciuse_id = faciuse_id;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getStr_date() {
		return str_date;
	}

	public void setStr_date(String str_date) {
		this.str_date = str_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
		
	}
}
