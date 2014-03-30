package com.tech.amazon.dao;

import com.tech.amazon.model.Customer;

public interface CustomerDao {

	boolean save(Customer category);

	boolean update(Customer category);

	boolean delete(int cId);

	Customer findById(int cId);

	Customer findByName(String name);
}
