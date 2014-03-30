package com.tech.amazon.model;

public class UserLogin {

	private int custId;
	private String userName;
	private String pWord;

	public UserLogin() {

	}

	public UserLogin(String userName, String pWord) {
		this.userName = userName;
		this.pWord = pWord;
	}

	public UserLogin(int custId, String userName, String pWord) {
		super();
		this.custId = custId;
		this.userName = userName;
		this.pWord = pWord;
	}

	public int getCustId() {
		return this.custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getpWord() {
		return this.pWord;
	}

	public void setpWord(String pWord) {
		this.pWord = pWord;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + this.custId;
		result = (prime * result) + ((this.pWord == null) ? 0 : this.pWord.hashCode());
		result = (prime * result) + ((this.userName == null) ? 0 : this.userName.hashCode());
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
		UserLogin other = (UserLogin) obj;
		if (this.custId != other.custId) {
			return false;
		}
		if (this.pWord == null) {
			if (other.pWord != null) {
				return false;
			}
		} else
			if (!this.pWord.equals(other.pWord)) {
				return false;
			}
		if (this.userName == null) {
			if (other.userName != null) {
				return false;
			}
		} else
			if (!this.userName.equals(other.userName)) {
				return false;
			}
		return true;
	}

	@Override
	public String toString() {
		return "UserLogin [custId=" + this.custId + ", userName=" + this.userName + ", pWord="
			+ this.pWord + "]";
	}

}
