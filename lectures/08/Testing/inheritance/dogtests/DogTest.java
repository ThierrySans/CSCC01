package dogtests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import dogs.Dog;

import org.junit.Before;
import org.junit.Test;

/**
 * Tester for public methods of class Dog.
 * @author anya
 */
public class DogTest {

  Dog dog;
  
  /**
   * Instantiates a Dog "Spot".
   */
  @Before
  public void setUp() {
    dog = new Dog("Spot");
  }

  /**
   * Test method for {@link Dog#walk()}.
   */
  @Test
  public void testWalk() {
    assertEquals("Dog.walk returned a wrong string.",
        "one two three four",
        dog.walk());
  }

  /**
   * Test method for {@link Dog#talk()}.
   */
  @Test
  public void testTalk() {
    assertEquals("Dog.talk returned a wrong string.",
        "Woof!",
        dog.talk());
  }

  /**
   * Test method for {@link Dog#respond(java.lang.String)}.
   */
  @Test
  public void testRespondMyName() {
    assertEquals("Dog.respond returned a wrong string.",
        "Running back",
        dog.respond("Spot"));
  }

  /**
   * Test method for {@link Dog#respond(java.lang.String)}.
   */
  @Test
  public void testRespondOtherName() {
    assertEquals("Dog.respond returned a wrong string.",
        "Ignoring",
        dog.respond("Rex"));
  }

  /**
   * Test method for {@link Dog#isMyName(java.lang.String)}.
   */
  @Test
  public void testIsMyNameMyName() {
    assertTrue("Dog.isMyName returned a wrong value.",
        dog.isMyName("Spot"));
  }

  /**
   * Test method for {@link Dog#isMyName(java.lang.String)}.
   */
  @Test
  public void testIsMyNameOtherName() {
    assertFalse("Dog.isMyName returned a wrong value.",
        dog.isMyName("Rex"));
  }
}