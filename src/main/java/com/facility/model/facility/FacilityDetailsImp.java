package com.facility.model.facility;

public class FacilityDetailsImp implements FacilityDetails {
		private String id;
		private String fdetail_id;
		private String description;
		private String note;
		
		public FacilityDetailsImp(){
		}	

	public String getFdetail_id() {
		return fdetail_id;
	}

	public void setFdetail_id(String fdetail_id) {
		this.fdetail_id = fdetail_id;
		
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
		this.id = id;
		
	}
	

}
