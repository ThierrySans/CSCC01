package ca.utoronto.utsc.grader.grades;

/**
 * An Exception used when the value for a Grade is invalid.
 * @author anya
 *
 */
public class InvalidGradeException extends Exception {

  private static final long serialVersionUID = 1592909226626580950L;

  /**
   * Creates a new <code>InvalidGradeException</code>.
   */
  public InvalidGradeException() {}

  /**
   * Creates a new <code>InvalidGradeException</code> with the given message.
   * @param message the message for the new <code>InvalidGradeException</code>
   */
  public InvalidGradeException(String message) {
    super(message);
  }
}