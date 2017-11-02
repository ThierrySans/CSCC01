package grades;

import java.util.Arrays;

/**
 * A representation of a letter grade: A[+-], B[+-], C[+-], D[+-], F.
 * @author anya
 *
 */
public class LetterGrade extends Grade {

  
  public static final String [] VALID_LETTERS = {"A", "B", "C", "D", "F"};
  public static final String [] VALID_SIGNS = {"+", "-", ""};

  private String letter;  // the letter in this letter grade
  private String sign;    // the sign in this letter grade, or ""
  
  /**
   * Crates a new <code>LetterGrade</code> with the give value.
   * @param grade the value of the new <code>LetterGrade</code>
   * @throws InvalidGradeException if grade is not valid
   */
  public LetterGrade(String grade) throws InvalidGradeException {
    if (grade.length() == 1 || grade.length() == 2) {
      String letter = grade.substring(0, 1);
      String sign = grade.substring(1);
      if (Arrays.asList(VALID_LETTERS).contains(letter)
          && Arrays.asList(VALID_SIGNS).contains(sign)) {
        this.letter = letter;
        this.sign = sign;
        return;
      }
    }
    throw new InvalidGradeException(grade);
  }
  
  @Override
  public double gpa() {
    double gpa;
    switch (letter) {
      case "A": gpa = 4;
        break;
      case "B": gpa = 3;
        break;
      case "C": gpa = 2;
        break;
      case "D": gpa = 1;
        break;
      default: gpa = 0;
        break; 
    }
    if (sign.equals("+") && gpa < 4) {
      gpa += 0.3;
    } else if (sign.equals("-")) {
      gpa -= 0.3;
    }
    return gpa;
  }

  @Override
  public String toString() {
    return String.format("%s%s", letter, sign);
  }
}