package dogtests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import dogs.Puppy;

import org.junit.Before;
import org.junit.Test;

/**
 * First Attempt at testing Puppy.
 * TODO: Fix it!
 * @author anya
 */
public class PuppyTest extends DogTest {

  Puppy puppy;
  
  /* (non-Javadoc)
   * @see tests.DogTest#setUp()
   */
  @Before
  public void setUp() {
    super.setUp();
    puppy = new Puppy("Spot");
  }

  /**
   * Test method for {@link dogs.Puppy#talk()}.
   */
  @Test
  public void testTalk() {
    assertEquals("Woof!Woof!Woof!Woof!Woof!",
        puppy.talk());
  }
  
  /**
   * Test method for {@link Puppy#isMyName(java.lang.String)}.
   */
  @Test
  public void testIsMyNameMyName() {
    assertFalse("Puppy.isMyName returned a wrong value.",
        puppy.isMyName("Spot"));
  }

  /**
   * Test method for {@link Puppy#isMyName(java.lang.String)}.
   */
  @Test
  public void testIsMyNameOtherName() {
    assertFalse("Puppy.isMyName returned a wrong value.",
        puppy.isMyName("Rex"));
  }
}