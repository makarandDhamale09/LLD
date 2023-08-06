package lld.decoratorPattern.toppings;

import lld.decoratorPattern.basePizza.BasePizza;

public class Mushroom extends ToppingsDecorator {
  private final BasePizza basePizza;

  public Mushroom(BasePizza basePizza) {
    super(basePizza);
    this.basePizza = basePizza;
  }

  @Override
  public int cost() {
    return basePizza.cost() + 20;
  }
}
