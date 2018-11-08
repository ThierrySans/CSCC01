package com.store.app;

import java.util.ArrayList;
import java.util.List;

import com.store.product.Product;

/**
 * Demo our Strategy implementation.
 */
public class App {

  /**
   * Makes some sample calls to our Strategy classes.
   * @param args as usual
   */
  public static void main(String[] args) {
	  
	List<Product> cart = new ArrayList<Product>();
	
	cart.add(new Product("electronics", "headphones", "234523452345", 110.0));
	cart.add(new Product("groceries", "pasta", "345634563456", 5.2));
	cart.add(new Product("fresh", "tomoatoes", "345634563456", 7.55));
    
    PriceCalculator pc = new PriceCalculator(cart, );
    
    System.out.println(pc);
  }
}
