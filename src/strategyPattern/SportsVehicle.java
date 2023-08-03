package strategyPattern;

import strategyPattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

  public SportsVehicle() {
    super(new SportsDriveStrategy());
  }
}
