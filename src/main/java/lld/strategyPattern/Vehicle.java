package lld.strategyPattern;

import lld.strategyPattern.strategy.DriveStrategy;

/**
 * In the Strategy pattern we create a separate interface of a strategy so that we avoid we can
 * avoid duplication of code wherever the implementation in the child class is same.
 *
 * <p><b><I>When to use :</I></b> The child is having same functionality which is not in the parent
 * but same in child classed
 */
public class Vehicle {

  private final DriveStrategy driveStrategy;

  public Vehicle(DriveStrategy driveStrategy) {
    this.driveStrategy = driveStrategy;
  }

  public void drive() {
    driveStrategy.drive();
  }
}
