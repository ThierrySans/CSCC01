package grades;

/**
 * A representation of a grade.
 * @author anya
 *
 */
public abstract class Grade {

  /**
   * Returns the GPA value that corresponds to this grade.
   * @return the GPA value that corresponds to this grade
   */
  public abstract double gpa();
  
  /**
   * Returns the String representation of the value of this Grade.
   * @return the String representation of the value of this Grade
   */
  public abstract String toString();
}
