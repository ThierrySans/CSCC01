package testgrades;

import grades.Grade;

public class GradeStub extends Grade {

  double gpa;
  
  public GradeStub(double gpa) {
    this.gpa = gpa;
  }
  
  @Override
  public double gpa() {
    return gpa;
  }

  @Override
  public String toString() {
    return "I am just a stub";
  }
}
