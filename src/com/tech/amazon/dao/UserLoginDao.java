package com.tech.amazon.dao;

import com.tech.amazon.model.UserLogin;

public interface UserLoginDao {

	boolean save(UserLogin userLogin);

	boolean update(UserLogin userLogin);

	boolean delete(int custId);

	UserLogin findById(int custId);

	UserLogin findByName(String name);
}
