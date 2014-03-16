package com.facility.model.facility;

public class FacilityDetailsImp implements FacilityDetails {
		private String id;
		private String facidetail_id;
		private String description;
		private String note;
		
		public FacilityDetailsImp(){
			
		}
	public String getFdetailID() {
		return facidetail_id;
	}

	public void setFdetailID(String facidetail_id) {
		this.facidetail_id = facidetail_id;
		
	}
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
		
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
		this.id = id;// TODO Auto-generated method stub
		
	}
	

}
