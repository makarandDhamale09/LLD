package lld.compositePattern.solution2WithComposite;

import static lld.compositePattern.solution2WithComposite.Operation.ADD;
import static lld.compositePattern.solution2WithComposite.Operation.MULTIPLY;

public class Main {
  /**
   * The expression here is '2 * (1 + 7 )' which will be solved with Composite design See Readme.md
   * file for details
   */
  public static void main(String[] args) {
    ArithmeticExpression two = new Number(2);
    ArithmeticExpression one = new Number(1);
    ArithmeticExpression seven = new Number(7);

    Expression addExpression = new Expression(one, seven, ADD);
    Expression multiplyExpression = new Expression(two, addExpression, MULTIPLY);

    System.out.println(multiplyExpression.evaluate());
  }
}
