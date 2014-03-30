package com.tech.amazon.model;

public class Category {

	private int cId;
	private String name;
	private String desc;
	private String status;

	public Category() {

	}

	public Category(int cId, String name, String desc, String status) {

		this.cId = cId;
		this.name = name;
		this.desc = desc;
		this.status = status;
	}

	public Category(String name, String desc, String status) {
		this.name = name;
		this.desc = desc;
		this.status = status;
	}

	public int getcId() {
		return this.cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Category [cId=" + this.cId + ", name=" + this.name + ", desc=" + this.desc
			+ ", status=" + this.status + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + this.cId;
		result = (prime * result) + ((this.desc == null) ? 0 : this.desc.hashCode());
		result = (prime * result) + ((this.name == null) ? 0 : this.name.hashCode());
		result = (prime * result) + ((this.status == null) ? 0 : this.status.hashCode());
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
		Category other = (Category) obj;
		if (this.cId != other.cId) {
			return false;
		}
		if (this.desc == null) {
			if (other.desc != null) {
				return false;
			}
		} else
			if (!this.desc.equals(other.desc)) {
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
		if (this.status == null) {
			if (other.status != null) {
				return false;
			}
		} else
			if (!this.status.equals(other.status)) {
				return false;
			}
		return true;
	}
}
