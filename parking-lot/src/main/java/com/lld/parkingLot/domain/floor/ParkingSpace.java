package com.lld.parkingLot.domain.floor;

import com.lld.parkingLot.domain.vehicle.Vehicle;

public class ParkingSpace {
  int spaceId;
  boolean isFree;
  double costPerHour;
  Vehicle vehicle;
  ParkingSpaceType parkingSpaceType;
}
