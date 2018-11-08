package com.store.app;

import java.util.List;

import com.store.product.Product;

public class PriceCalculator {

	private Double total;
	
	private Double getTotalPrice(List<Product> cart) {
		Double total = 0.0;
		for(Product item:cart){
			total += item.getPrice();
		}
		return total;
	}
	
	public PriceCalculator(List<Product> cart, DiscountInterface discout) {
		
	}

}
