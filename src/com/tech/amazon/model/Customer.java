package com.tech.amazon.model;

public class Customer {

	private int custId;
	private String name;
	private Address address;
	private String email;
	private long phone;
	private long ccno;
	private String vdate;

	public Customer() {

	}

	public Customer(String name, Address address, String email, long phone, long ccno,
		String vdate) {

		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.ccno = ccno;
		this.vdate = vdate;
	}

	public Customer(int custId, String name, Address address, String email, long phone,
		long ccno, String vdate) {
		super();
		this.custId = custId;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.ccno = ccno;
		this.vdate = vdate;
	}

	public int getCustId() {
		return this.custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return this.phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public long getCcno() {
		return this.ccno;
	}

	public void setCcno(long ccno) {
		this.ccno = ccno;
	}

	public String getVdate() {
		return this.vdate;
	}

	public void setVdate(String vdate) {
		this.vdate = vdate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((this.address == null) ? 0 : this.address.hashCode());
		result = (prime * result) + (int) (this.ccno ^ (this.ccno >>> 32));
		result = (prime * result) + this.custId;
		result = (prime * result) + ((this.email == null) ? 0 : this.email.hashCode());
		result = (prime * result) + ((this.name == null) ? 0 : this.name.hashCode());
		result = (prime * result) + (int) (this.phone ^ (this.phone >>> 32));
		result = (prime * result) + ((this.vdate == null) ? 0 : this.vdate.hashCode());
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
		Customer other = (Customer) obj;
		if (this.address == null) {
			if (other.address != null) {
				return false;
			}
		} else
			if (!this.address.equals(other.address)) {
				return false;
			}
		if (this.ccno != other.ccno) {
			return false;
		}
		if (this.custId != other.custId) {
			return false;
		}
		if (this.email == null) {
			if (other.email != null) {
				return false;
			}
		} else
			if (!this.email.equals(other.email)) {
				return false;
			}
		if (this.name == null) {
			if (other.name != null) {
				return false;
			}
		} else
			if (!this.name.equals(other.name)) {
				return false;
			}
		if (this.phone != other.phone) {
			return false;
		}
		if (this.vdate == null) {
			if (other.vdate != null) {
				return false;
			}
		} else
			if (!this.vdate.equals(other.vdate)) {
				return false;
			}
		return true;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + this.custId + ", name=" + this.name + ", address="
			+ this.address + ", email=" + this.email + ", phone=" + this.phone + ", ccno="
			+ this.ccno + ", vdate=" + this.vdate + "]";
	}

}
