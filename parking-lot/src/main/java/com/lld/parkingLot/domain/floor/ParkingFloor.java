package com.lld.parkingLot.domain.floor;

import java.util.List;

public class ParkingFloor {
  private final int levelId;
  private boolean isFull;
  private final List<ParkingSpace> parkingSpaces;
  private final ParkingDisplayBoard parkingDisplayBoard;

  public ParkingFloor(
      int levelId, List<ParkingSpace> parkingSpaces, ParkingDisplayBoard parkingDisplayBoard) {
    this.levelId = levelId;
    this.parkingSpaces = parkingSpaces;
    this.parkingDisplayBoard = parkingDisplayBoard;
  }

  public int getLevelId() {
    return levelId;
  }

  public boolean isFull() {
    return isFull;
  }

  public void setFull(boolean full) {
    isFull = full;
  }

  public List<ParkingSpace> getParkingSpaces() {
    return parkingSpaces;
  }

  public ParkingDisplayBoard getParkingDisplayBoard() {
    return parkingDisplayBoard;
  }

  @Override
  public String toString() {
    return "ParkingFloor{"
        + "levelId="
        + levelId
        + ", isFull="
        + isFull
        + ", parkingSpaces="
        + parkingSpaces
        + ", parkingDisplayBoard="
        + parkingDisplayBoard
        + '}';
  }
}
