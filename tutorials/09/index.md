---
layout: default
permalink: /tutorials/09/
---

For this lab, you have been given this *horrible* code that calculates the CGPA given a collection of grades. Grades can either being letter grades (A+, B, ...) or numeric grades (34, 99, ...). 

Your goals are: 

1. refactor this code using the strategy design pattern
2. test this newly refactored code using the mock object technique

# Strategy Design Pattern

In this task, your goal is to refactor the *horrible* code to make it more modular and maintainable. To do so, we are going to use one of the design patterns called the **strategy design patter**.  

After reading and learning about the [strategy design pattern](https://sourcemaking.com/design_patterns/strategy), refactor the starter code to have: 

- `GpaCalculator` being the client
- `Grade` being the abstraction (Java interface)
- `LetterGrade` and `NumericGrade` being two implementations of `Grade`

# Testing

In this task, we are going to test our freshly refactored code with the **mock object** technique. This technique is particularly appropriate to test pieces of code that rely on the strategy pattern. The idea is to design independent test suites that will test the `GpaCalculator` (client) and the two implementations independently. 

Testing `GpaCalculator` means instantiating an object of type `Grade`, the idea is not to rely on neither of the two concrete implementations but rather on a new implementation called `MockGrade` specifically written for the testing purpose.

Following this idea, write the independent test suites:

1. `GpaCalculatorTester` that tests `GpaCalculator`. This tester should use the `MockGrade` class (stored in the testing package as well) instead of `LetterGrade` or `NumericGrade`.
2. `LetterGradeTest` that tests `LetterGrade`
3. `NumericGradeTest` that tests `NumericGrade`

 

  

