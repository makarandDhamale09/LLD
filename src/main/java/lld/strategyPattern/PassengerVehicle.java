package lld.strategyPattern;

import lld.strategyPattern.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {

  public PassengerVehicle() {
    super(new NormalDriveStrategy());
  }
}
