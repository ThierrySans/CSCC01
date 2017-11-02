package grades;

/**
 * A representation of a numeric grade, in the 0 to 100 range.
 * @author anya
 *
 */
public class NumericGrade extends Grade {

  private int grade;  // the value of this Grade
  
  /**
   * Creates a new <code>NumericGrade</code> with the given value.
   * @param grade the numeric value of the new <code>NumericGrade</code>, 
   *     must be in the range [0, 100].
   * @throws InvalidGradeException if grade is not in [0, 100]
   */
  public NumericGrade(int grade) throws InvalidGradeException {
    if (0 <= grade && grade <= 100) {
      this.grade = grade;
    } else {
      throw new InvalidGradeException(String.format("Invalid value for grade: %d", grade));
    }
  }

  @Override
  public double gpa() {
    if (grade < 50) {  // special rule for 0-49
      return 0.0;
    }
    if (grade >= 85) { // special rules for 80-100
      return 4.0;
    }
    if (grade >= 80) {
      return 3.7;
    }
    // the rest follow the same pattern
    double gpa = grade / 10 - 4;
    int d0 = grade % 10;
    if (d0 < 3) {
      gpa -= 0.3;
    }
    if (d0 > 6) {
      gpa += 0.3;
    }
    return gpa;
  }
  
  @Override
  public String toString() {
    return String.format("%s", grade);
  }
}