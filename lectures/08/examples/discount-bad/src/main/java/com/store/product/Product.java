package com.store.product;

public class Product {
	
	private String category;
	private String name;
	private String productID;
	private Double price;

	public Product(String category, String name, String productID, Double price) {
		this.category = category;
		this.name = name;
		this.productID = productID;
		this.price = price;
	}
	
	public String toString() {
		return ("[" + this.category + "] " + this.name + "(# " + this.productID + ") " + this.price + " CAD");
	}

	public Double getPrice() {
		return this.price;
	}
}
