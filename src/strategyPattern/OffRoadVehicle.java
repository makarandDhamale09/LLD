package strategyPattern;

import strategyPattern.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {

  public OffRoadVehicle() {
    super(new SportsDriveStrategy());
  }
}
