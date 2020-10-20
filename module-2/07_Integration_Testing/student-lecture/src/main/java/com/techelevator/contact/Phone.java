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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (contactId ^ (contactId >>> 32));
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((phoneType == null) ? 0 : phoneType.hashCode());
		result = prime * result + ((phoneTypeOther == null) ? 0 : phoneTypeOther.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		if (contactId != other.contactId)
			return false;
		if (id != other.id)
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (phoneType == null) {
			if (other.phoneType != null)
				return false;
		} else if (!phoneType.equals(other.phoneType))
			return false;
		if (phoneTypeOther == null) {
			if (other.phoneTypeOther != null)
				return false;
		} else if (!phoneTypeOther.equals(other.phoneTypeOther))
			return false;
		return true;
	}
	
}
