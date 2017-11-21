package ca.utoronto.utsc.designpatterns.observer;

import java.util.Observable;

/** A product **/
public class Product extends Observable {

  private String name;
  private double price;

  /**
   * Creates a {@link pricewatch.Product} with the given name, price, and store.
   * @param name name of the new {@link pricewatch.Product}
   * @param price price of the new {@link pricewatch.Product}
   */
  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }


  /**
   * Returns the name of this {@link pricewatch.Product}.
   * @return the name of this {@link pricewatch.Product}
   */
  public String getName() {
    return name;
  }

  /**
   * Returns the price of this {@link pricewatch.Product}.
   * @return the price of this {@link pricewatch.Product}
   */
  public double getPrice() {
    return price;
  }

  /**
   * Changes the price of this {@link pricewatch.Product} to newPrice. All 
   * observers are notified, if the price is changed.
   * @param newPrice the new price of this {@link pricewatch.Product}
   */
  public void changePrice(double newPrice) {
    if (price == newPrice) {
      return;
    }
    price = newPrice;
    setChanged();
    notifyObservers(this);
  }

  @Override
  public String toString() {
    return String.format("%s costs %.2f.\n", name, price);
  }
}