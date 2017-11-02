package dogs;

/**
 * A Puppy.
 * @author anya
 */
public class Puppy extends Dog {

  /**
   * Creates a new Puppy with the given name.
   * @param name name of the new Puppy
   */
  public Puppy(String name) {
    super(name);
  }

  @Override
  public String talk() {
    return "Woof!Woof!Woof!Woof!Woof!";
  }
  
  @Override
  public boolean isMyName(String name) {
    return false;
  }
}