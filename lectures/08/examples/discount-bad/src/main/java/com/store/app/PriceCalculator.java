package com.store.app;

import java.util.List;

import com.store.product.Product;

public class PriceCalculator {

	Double total;
	
	private Double getTotalPrice(List<Product> cart) {
		Double total = 0.0;
		for(Product item:cart){
			total += item.getPrice();
		}
		return total;
	}
	
	public PriceCalculator(List<Product> cart, String discout) {
		switch (discout) {
    	case "ConstantDiscount":
    		this.total = 0.0;
    	case "SeasonalDiscount":
    		this.total = 0.0;
    	case "HappyDayDiscount":
    		this.total = 0.0;
        default: 
        	this.total = 0.0;
		}
	}

}
