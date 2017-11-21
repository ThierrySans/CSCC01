package ca.utoronto.utsc.designpatterns.observer;

import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public class Shopper implements Observer {

  private String name;

  /**
   * Creates a new {@link pricewatch.Shopper} with the given name.
   * @param name name of the new {@link pricewatch.Shopper}
   */
  public Shopper(String name) {
    this.name = name;
  }

  /**
   * Returns the name of this {@link pricewatch.Shopper}.
   * @return the name of this {@link pricewatch.Shopper}
   */
  public String getName() {
    return this.name;
  }

  /**
   * Prints a message about a price change.
   */
  @Override
  public void update(Observable ob, Object arg) {
    Product product = (Product) arg;
    String msg = String.format("%s: price change for %s to %.2f.\n", name, product.getName(), product.getPrice());
    System.out.println(msg);
  }
}
