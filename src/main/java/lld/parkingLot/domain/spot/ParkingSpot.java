package lld.parkingLot.domain.spot;

public abstract class ParkingSpot {
  private final int totalSpots;
  private final int occupiedSpots;

  protected ParkingSpot(int totalSpots, int occupiedSpots) {
    this.totalSpots = totalSpots;
    this.occupiedSpots = occupiedSpots;
  }

  public int getTotalSpots() {
    return totalSpots;
  }

  public int getOccupiedSpots() {
    return occupiedSpots;
  }

  private int getOpenSpotCount() {
    return totalSpots - occupiedSpots;
  }
}
