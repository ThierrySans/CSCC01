package dogs;

/**
 * A dog.
 * @author anya
 */
public class Dog {
  
  private String name;
  
  /**
   * Creates a new Dog with the given name.
   * @param name name of the newly created Dog
   */
  public Dog(String name) {
    this.name = name;
  }
  
  /**
   * Returns "one two three four".
   * @return "one two three four"
   */
  public String walk() {
    return "one two three four";
  }
  
  /**
   * Returns "Woof!".
   * @return "Woof!"
   */
  public String talk() {
    return "Woof!";
  }
  
  /**
   * Returns "Running back" if name is the name of this Dog. Returns 
   * "Ignoring" otherwise. 
   * @param name the name to compare to
   * @return "Running back" if name is the name of this Dog and
   *     "Ignoring", otherwise
   */
  public String respond(String name) {
    if (isMyName(name)) {
      return "Running back";
    } else {
      return "Ignoring";
    }
  } 

  /**
   * Returns if the given name is the name of this Dog.
   * @param name the name to compare to
   * @return true if name is the name of this Dog, and false otherwise
   */
  public boolean isMyName(String name) {
    return name.equals(this.name);
  }
}