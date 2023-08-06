package lld.strategyPattern;

import lld.strategyPattern.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {

  public OffRoadVehicle() {
    super(new SportsDriveStrategy());
  }
}
