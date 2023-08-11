package com.lld.parkingLot.domain.account;

import com.lld.parkingLot.domain.floor.ParkingDisplayBoard;
import com.lld.parkingLot.domain.floor.ParkingFloor;
import com.lld.parkingLot.domain.floor.ParkingSpace;
import com.lld.parkingLot.domain.parkinglot.ParkingLot;
import java.util.List;

public class Admin extends Account {

  public boolean addParkingFloor(ParkingLot parkingLot, ParkingFloor parkingFloor) {
    List<ParkingFloor> parkingFloors = parkingLot.getParkingFloors();
    parkingFloors.add(parkingFloor);
    return false;
  }

  public boolean addParkingSpace(ParkingFloor parkingFloor, ParkingSpace parkingSpace) {
    return false;
  }

  public boolean addParkingDisplayBoard(
      ParkingFloor parkingFloor, ParkingDisplayBoard parkingDisplayBoard) {
    return false;
  }
}
