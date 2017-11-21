package ca.utoronto.utsc.designpatterns.observer;

public class Main {

  /**
   * Makes some sample calls to methods of Product and Shopper.
   * @param args the usual
   */
  public static void main(String[] args) {
    Product banana = new Product("banana", 0.59);
    Product cereal = new Product("cereal", 7.49);

    Shopper alice = new Shopper("Alice");
    Shopper bob = new Shopper("Bob");

    banana.addObserver(bob);
    cereal.addObserver(bob);
    cereal.addObserver(alice);

    banana.changePrice(0.55);
    cereal.changePrice(10 / 3.0);
    cereal.changePrice(15.42);    
    
  }
}
