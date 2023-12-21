package lld.compositePattern.solution2WithComposite;

public class Number implements ArithmeticExpression {
  private int value;

  public Number(int value) {
    this.value = value;
  }

  @Override
  public int evaluate() {
    System.out.println("Number value is : " + value);
    return value;
  }
}
