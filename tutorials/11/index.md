---
layout: default
permalink: /tutorials/11/
---

In this lab, you are going to experiment with two design patterns: [Composite](http://www.oodesign.com/composite-pattern.html) and [observer](http://www.oodesign.com/observer-pattern.html)

# Composite Design Pattern

In this task, your goal is to refactor the *horrible* code to make it more modular and maintainable using the **Composite Design Pattern**. The idea is to refactor the class `Tree` to avoid having all of these repetitive `if` statements to check whether the subtrees are null or not in every tree method. Refactoring this code should not impact the client (the `Main` class here). This means that your refactored code should work without changing anything in the class `Main.java`.  

Here are few hints about how to refactor this code based on theComposite Design Pattern: 

1. create an interface called `TreeComponent` that contains all `Tree` methods.
2. create a class `Leaf` that implements `TreeCompoment`. A `Leaf` object is an empty tree. 
3. refactor the class `Tree` to implement `TreeCompoment` and use `Leaf` objects instead of null values. Doing so should get rid of all of the `if` statements in the code. 

# Observer Design Pattern

In this task, your goal is to understand and implement the **Observer Design Pattern**. The code given as example is already relying on this design pattern. However, there is a big part of the design pattern that you do not see since the example uses two components defined by the `java.util` API:

- the `Observer` interface
- and the `Observable` abstract class

To fully understand the Observer Design Pattern, it is good to see how these two components are implemented. Therefore, the idea is to re-implement these two components rather than using the ones from the `java.util` API. Re-implementing these components should not have any impact the existing code. The files `Main.java`, `Product.java` and `Shopper.java` should remain unchanged beyond substituting: 

1. `import java.util.Observable` with `ca.utoronto.utsc.designpatterns.observer.Observable`
2. and `import java.util.Observer` with `ca.utoronto.utsc.designpatterns.observer.Observer`

 

  

