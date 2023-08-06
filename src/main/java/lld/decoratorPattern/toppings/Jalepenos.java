package lld.decoratorPattern.toppings;

import lld.decoratorPattern.basePizza.BasePizza;

public class Jalepenos extends ToppingsDecorator {
  private final BasePizza basePizza;

  public Jalepenos(BasePizza basePizza) {
    super(basePizza);
    this.basePizza = basePizza;
  }

  @Override
  public int cost() {
    return basePizza.cost() + 15;
  }
}
