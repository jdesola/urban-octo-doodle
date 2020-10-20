package com.techelevator.contact;

public class Phone {

	private long id;
	private long contactId;
	private String phoneNumber;
	private String phoneType;
	private String phoneTypeOther;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getContactId() {
		return contactId;
	}
	public void setContactId(long contactId) {
		this.contactId = contactId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	public String getPhoneTypeOther() {
		return phoneTypeOther;
	}
	public void setPhoneTypeOther(String phoneTypeOther) {
		this.phoneTypeOther = phoneTypeOther;
	}
	
}
