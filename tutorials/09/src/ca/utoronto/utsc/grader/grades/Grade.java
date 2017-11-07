package ca.utoronto.utsc.grader.grades;

import ca.utoronto.utsc.grader.grades.InvalidGradeException;

import java.util.Arrays;

public class Grade {

    private String type;
    
    // numeric grade
    private int score;  
  
    // letter grade
    
    public static final String [] VALID_LETTERS = {"A", "B", "C", "D", "F"};
    public static final String [] VALID_SIGNS = {"+", "-", ""};

    private String letter;  // the letter in this letter grade
    private String sign;    // the sign in this letter grade, or ""
  
    /**
     * Creates a new <code>Grade</code> with the given value.
     * @param score the numeric value of the new <code>Grade</code>, 
     *     must be in the range [0, 100].
     * @throws InvalidGradeException if grade is not in [0, 100]
     */
    public Grade(int score) throws InvalidGradeException {
      if (0 <= score && score <= 100) {
        this.type = "numeric";
        this.score = score;
      } else {
        throw new InvalidGradeException(String.format("Invalid value for grade: %d", score));
      }
    }
    
    /**
     * Creates a new <code>Grade</code> with the give value.
     * @param grade the value of the new <code>LetterGrade</code>
     * @throws InvalidGradeException if grade is not valid
     */
    public Grade(String grade) throws InvalidGradeException {
      if (grade.length() == 1 || grade.length() == 2) {
        String letter = grade.substring(0, 1);
        String sign = grade.substring(1);
        if (Arrays.asList(VALID_LETTERS).contains(letter)
            && Arrays.asList(VALID_SIGNS).contains(sign)) {
          this.type = "letter";
          this.letter = letter;
          this.sign = sign;
          return;
        }
      }
      throw new InvalidGradeException(grade);
    }

    public double gpa(){
        double gpa;
        switch(this.type){
            case "numeric": 
                if (this.score < 50) {  // special rule for 0-49
                return 0.0;
                }
                if (this.score >= 85) { // special rules for 80-100
                return 4.0;
                }
                if (this.score >= 80) {
                return 3.7;
                }
                // the rest follow the same pattern
                gpa = this.score / 10 - 4;
                int d0 = this.score % 10;
                if (d0 < 3) {
                gpa -= 0.3;
                }
                if (d0 > 6) {
                gpa += 0.3;
                }
                return gpa;
            case "letter": 
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
            default:
                return 0;
        }
    }
  
    public String toString() {
        switch(this.type){
            case "numeric": 
              return String.format("%d", this.score);
            case "letter":
                return String.format("%s%s", this.letter, this.sign);
            default:
                return "";
        }
    }

}
