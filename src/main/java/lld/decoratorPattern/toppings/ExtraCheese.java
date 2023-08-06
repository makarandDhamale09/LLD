package lld.decoratorPattern.toppings;

import lld.decoratorPattern.basePizza.BasePizza;

public class ExtraCheese extends ToppingsDecorator {
  private final BasePizza basePizza;

  public ExtraCheese(BasePizza basePizza) {
    super(basePizza);
    this.basePizza = basePizza;
  }

  @Override
  public int cost() {
    return basePizza.cost() + 10;
  }
}
