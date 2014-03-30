package com.tech.amazon.action;

import com.tech.amazon.dao.CustomerDao;
import com.tech.amazon.dao.CustomerDaoImpl;
import com.tech.amazon.model.Address;
import com.tech.amazon.model.Customer;

public class CustomerAction {

	private CustomerDao customerDao = new CustomerDaoImpl();

	public boolean createNewCustomer(String name, String street, String city, String state,
		int zip, long phone, String email, long ccno, String vdate) {

		Address address = new Address(street, city, state, zip);
		Customer customer = new Customer(name, address, email, phone, ccno, vdate);
		return this.customerDao.save(customer);
	}
}
