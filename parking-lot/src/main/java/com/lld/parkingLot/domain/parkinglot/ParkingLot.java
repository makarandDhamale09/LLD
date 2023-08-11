package com.lld.parkingLot.domain.parkinglot;

import com.lld.parkingLot.domain.floor.ParkingFloor;
import com.lld.parkingLot.domain.gate.Entrance;
import com.lld.parkingLot.domain.gate.Exit;
import java.util.List;

public class ParkingLot {
  private final List<ParkingFloor> parkingFloors;
  private final List<Entrance> entrances;
  private final List<Exit> exits;
  private final Address address;
  private final String parkingLotName;

  public ParkingLot(
      List<ParkingFloor> parkingFloors,
      List<Entrance> entrances,
      List<Exit> exits,
      Address address,
      String parkingLotName) {
    this.parkingFloors = parkingFloors;
    this.entrances = entrances;
    this.exits = exits;
    this.address = address;
    this.parkingLotName = parkingLotName;
  }

  public List<ParkingFloor> getParkingFloors() {
    return parkingFloors;
  }

  public List<Entrance> getEntrances() {
    return entrances;
  }

  public List<Exit> getExits() {
    return exits;
  }

  public Address getAddress() {
    return address;
  }

  public String getParkingLotName() {
    return parkingLotName;
  }

  @Override
  public String toString() {
    return "ParkingLot{"
        + "parkingFloors="
        + parkingFloors
        + ", entrances="
        + entrances
        + ", exits="
        + exits
        + ", address="
        + address
        + ", parkingLotName='"
        + parkingLotName
        + '\''
        + '}';
  }
}
