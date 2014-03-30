package com.tech.amazon.action;

import com.tech.amazon.dao.UserLoginDaoImpl;
import com.tech.amazon.model.UserLogin;

public class LoginAction {

	public boolean login(String uname, String pword) {

		UserLogin userLogin = new UserLoginDaoImpl().findByName(uname);
		if (userLogin == null) {
			return false;
		} else {

			if (userLogin.getpWord().equals(pword)) {
				return true;
			} else {
				return false;
			}
		}

	}
}
