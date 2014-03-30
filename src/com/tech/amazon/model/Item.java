package com.tech.amazon.model;

public class Item {

	private int itemId;
	private int categoryId;
	private String name;
	private double unitPrice;
	private int qtyInStock;

	public Item() {

	}

	public Item(int categoryId, String name, double unitPrice, int qtyInStock) {

		this.categoryId = categoryId;
		this.name = name;
		this.unitPrice = unitPrice;
		this.qtyInStock = qtyInStock;
	}

	public Item(int itemId, int categoryId, String name, double unitPrice, int qtyInStock) {
		super();
		this.itemId = itemId;
		this.categoryId = categoryId;
		this.name = name;
		this.unitPrice = unitPrice;
		this.qtyInStock = qtyInStock;
	}

	public int getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQtyInStock() {
		return this.qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + this.categoryId;
		result = (prime * result) + this.itemId;
		result = (prime * result) + ((this.name == null) ? 0 : this.name.hashCode());
		result = (prime * result) + this.qtyInStock;
		long temp;
		temp = Double.doubleToLongBits(this.unitPrice);
		result = (prime * result) + (int) (temp ^ (temp >>> 32));
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
		Item other = (Item) obj;
		if (this.categoryId != other.categoryId) {
			return false;
		}
		if (this.itemId != other.itemId) {
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
		if (this.qtyInStock != other.qtyInStock) {
			return false;
		}
		if (Double.doubleToLongBits(this.unitPrice) != Double.doubleToLongBits(other.unitPrice)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + this.itemId + ", categoryId=" + this.categoryId + ", name="
			+ this.name + ", unitPrice=" + this.unitPrice + ", qtyInStock=" + this.qtyInStock + "]";
	}

}
