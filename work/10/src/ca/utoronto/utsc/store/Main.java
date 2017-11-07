package ca.utoronto.utsc.store;

import ca.utoronto.utsc.store.discounts.Discount;
import ca.utoronto.utsc.store.discounts.ConstantDiscount;
import ca.utoronto.utsc.store.discounts.SeasonalDiscount;
import ca.utoronto.utsc.store.discounts.HappyDayDiscount;

import ca.utoronto.utsc.store.calculator.PriceCalculator;

import ca.utoronto.utsc.store.products.Priced;
import ca.utoronto.utsc.store.products.Product;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Demo our Strategy implementation.
 * @author anya (modified by thierry)
 */
public class Main {

  /**
   * Makes some sample calls to our Strategy classes.
   * @param args as usual
   */
  public static void main(String[] args) {
    
    Calendar calendar = Calendar.getInstance();
    calendar.set(2015, 10, 15); // Nov 15th 2015
    Date from = calendar.getTime();
    calendar.set(2015, 11, 15); // Dec 15th 2015
    Date to = calendar.getTime();

    System.out.println(String.format("from %s to %s", from,  to));
    
    Discount cd = new ConstantDiscount(5);
    Discount sd = new SeasonalDiscount(0.2, from, to);
    Discount hdd = new HappyDayDiscount(0.5, Calendar.SUNDAY);
    
    PriceCalculator pc1 = new PriceCalculator(cd);
    PriceCalculator pc2 = new PriceCalculator(sd);
    PriceCalculator pc3 = new PriceCalculator(hdd);
    
    Priced usbStick = new Product("234523452345", 35);
    Priced headphones = new Product("345634563456", 120);
    Priced dress = new Product("123412341234", 80);

    List<Priced> stuff = Arrays.asList(new Priced [] {usbStick, headphones, dress});
    System.out.println("With no discount, total price is 235.");
    System.out.println(String.format("Today is %s.", new Date())); 
    System.out.println(String.format("With constant discount, total price is %.2f.", 
        pc1.getTotalPrice(stuff)));
    System.out.println(String.format("With seasonal discount, total price is %.2f.", 
        pc2.getTotalPrice(stuff)));
    System.out.println(String.format("With happy day discount, total price is %.2f.", 
        pc3.getTotalPrice(stuff)));
  }
}
