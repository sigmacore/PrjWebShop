package com.tech.amazon.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	int cId;
	List<SelectedItem> selectItems = null;

	public ShoppingCart() {
		this.selectItems = new ArrayList<SelectedItem>();
	}

	public ShoppingCart(int cId) {
		this.cId = cId;
		this.selectItems = new ArrayList<SelectedItem>();
	}

	public ShoppingCart(int cId, List<SelectedItem> selectItems) {
		super();
		this.cId = cId;
		this.selectItems = selectItems;
	}

}
