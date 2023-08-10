package lld.parkingLot.domain;

import java.util.List;
import lld.parkingLot.domain.spot.ParkingSpot;

public class ParkingFloor {
  private final int floorNo;
  private final List<ParkingSpot> parkingSpots;
  private final int totalSpots;
  private List<ParkingSpot> occupiedSpots;

  public ParkingFloor(int floorNo, List<ParkingSpot> parkingSpots, int totalSpots) {
    this.floorNo = floorNo;
    this.parkingSpots = parkingSpots;
    this.totalSpots = totalSpots;
  }

  public int getFloorNo() {
    return floorNo;
  }

  public List<ParkingSpot> getParkingSpots() {
    return parkingSpots;
  }

  public int getTotalSpots() {
    return totalSpots;
  }
}
