package com.tech.amazon.model;

public class Address {

	private int addressId;
	private String street;
	private String city;
	private String state;
	private int zip;

	public Address() {

	}

	public Address(String street, String city, String state, int zip) {

		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public Address(int addressId, String street, String city, String state, int zip) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public int getAddressId() {
		return this.addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return this.zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + this.addressId;
		result = (prime * result) + ((this.city == null) ? 0 : this.city.hashCode());
		result = (prime * result) + ((this.state == null) ? 0 : this.state.hashCode());
		result = (prime * result) + ((this.street == null) ? 0 : this.street.hashCode());
		result = (prime * result) + this.zip;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Address other = (Address) obj;
		if (this.addressId != other.addressId) {
			return false;
		}
		if (this.city == null) {
			if (other.city != null) {
				return false;
			}
		} else
			if (!this.city.equals(other.city)) {
				return false;
			}
		if (this.state == null) {
			if (other.state != null) {
				return false;
			}
		} else
			if (!this.state.equals(other.state)) {
				return false;
			}
		if (this.street == null) {
			if (other.street != null) {
				return false;
			}
		} else
			if (!this.street.equals(other.street)) {
				return false;
			}
		if (this.zip != other.zip) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + this.addressId + ", street=" + this.street + ", city="
			+ this.city + ", state=" + this.state + ", zip=" + this.zip + "]";
	}

}
