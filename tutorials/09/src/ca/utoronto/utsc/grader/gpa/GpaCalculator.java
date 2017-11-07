package ca.utoronto.utsc.grader.gpa;

import ca.utoronto.utsc.grader.grades.Grade;

import java.util.Collection;

/**
 * A representation of a grade.
 * @author anya
 *
 */
public class GpaCalculator {

  /**
   * Returns the CGPA of all Grades in the given Collection.
   * @return the CGPA of all Grades in grades
   * @throws NoGradesException if grades is empty
   */
  public static double cgpa(Collection<Grade> grades) throws NoGradesException {
    if (grades.isEmpty()) {
      throw new NoGradesException();
    }
    double theCgpa = 0;
    for (Grade grade: grades) {
      theCgpa += grade.gpa();
    }
    return theCgpa / grades.size();
  }

}
