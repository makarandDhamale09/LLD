package lld.parkingLot.domain;

import java.util.List;
import lld.parkingLot.domain.spot.ParkingSpot;

public class ParkingLot {
  private final String name;
  private final List<ParkingFloor> parkingFloors;
  private final List<ParkingSpot> parkingSpots;

  public ParkingLot(String name, List<ParkingFloor> parkingFloors, List<ParkingSpot> parkingSpots) {
    this.name = name;
    this.parkingFloors = parkingFloors;
    this.parkingSpots = parkingSpots;
  }

  public String getName() {
    return name;
  }

  public List<ParkingFloor> getParkingFloors() {
    return parkingFloors;
  }

  public List<ParkingSpot> getParkingSpots() {
    return parkingSpots;
  }
}
