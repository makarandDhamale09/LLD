# Composite Design pattern

Calculator problem can also be solved with composite design pattern.
Suppose we have an expression 2 * (1 + 7). 

![compositeDesignPatternSolution2.png](..%2F..%2F..%2F..%2Fresources%2FcompositeDesignPatternSolution2.png)

To solve this Problem we will use the same approach as the **solution 1**.
  
We will create an **ArithmeticExpression** Interface with a evaluate method which returns a integer.

The leaf class is **Number** class implements ArithmeticExpression interface with int value variable which is returned 
in evaluate method.

The other concrete class is **Expression** class which also implements ArithmeticExpression class. In the evaluate method 
of this class we will add the logic.There are 3 variables in this class leftOperation, rightOperation of type ArithmeticExpression 
and Operation enum which has different operation like add, subtract, multiply and divide;