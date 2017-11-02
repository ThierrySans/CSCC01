package testgrades;

import static org.junit.Assert.assertEquals;

import grades.GpaCalculator;
import grades.Grade;
import grades.NoGradesException;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class GpaCalculatorTest {

  static final double EPSILON = 0.01;
  
  Grade g1;
  Grade g2;
  Grade g3;
  Collection<Grade> grades;
  
  /**
   * Set up some test doubles.
   */
  @Before
  public void setUp() {
    g1 = new GradeStub(2.0);
    g2 = new GradeStub(3.7);
    g3 = new GradeStub(1.3);
    grades = new ArrayList<>();
  }
  
  @Test(expected = NoGradesException.class)
  public void testCgpaEmpty() {
    GpaCalculator.cgpa(grades);
  }

  @Test
  public void testCgpaOne() {
    grades.add(g1);
    assertEquals("Wrong cgpa value.", 2.0, GpaCalculator.cgpa(grades), EPSILON);
  }

  @Test
  public void testCgpaMany() {
    grades.add(g1);
    grades.add(g2);
    grades.add(g3);
    assertEquals("Wrong cgpa value.", 2.333, GpaCalculator.cgpa(grades), EPSILON);
  }
}