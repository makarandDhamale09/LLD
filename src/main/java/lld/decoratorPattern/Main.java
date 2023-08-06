package lld.decoratorPattern;

import lld.decoratorPattern.basePizza.BasePizza;
import lld.decoratorPattern.basePizza.Margarita;
import lld.decoratorPattern.toppings.Jalepenos;
import lld.decoratorPattern.toppings.Mushroom;

/**
 * Decorator pattern is a pattern where we decorate the base calls so that the feature of base class
 * are decorated with the new feature.
 *
 * <p>Decorator pattern is used when the object id fully constructed, and then we need to add new
 * features to the object. To the case the builder pattern is used when we need add new features
 * while creating the object. Once the object is created it cannot be changed in builder pattern.
 * But with the decorator pattern the created object, new features can be added to already created
 * object
 *
 * <p>Here we see we can add multiple features to base pizza.
 */
public class Main {
  public static void main(String[] args) {
    BasePizza pizza = new Margarita();

    pizza = new Jalepenos(pizza);
    pizza = new Mushroom(pizza);

    System.out.println(pizza.cost());
  }
}
