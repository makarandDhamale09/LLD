package com.lld.parkingLot;

import com.lld.parkingLot.domain.account.Admin;
import com.lld.parkingLot.domain.floor.ParkingDisplayBoard;
import com.lld.parkingLot.domain.floor.ParkingFloor;
import com.lld.parkingLot.domain.floor.ParkingSpace;
import com.lld.parkingLot.domain.gate.Entrance;
import com.lld.parkingLot.domain.gate.Exit;
import com.lld.parkingLot.domain.parkinglot.Address;
import com.lld.parkingLot.domain.parkinglot.ParkingLot;
import java.util.ArrayList;
import java.util.List;

public class Start {
  public static void main(String[] args) {
    Admin admin = new Admin();
    List<ParkingFloor> parkingFloors = new ArrayList<>();
    ArrayList<Entrance> entrances = new ArrayList<>();
    ArrayList<Exit> exits = new ArrayList<>();
    Address address = new Address();

    ParkingLot parkingLot = new ParkingLot(parkingFloors, entrances, exits, address, "Parking Lot");
    ParkingDisplayBoard displayBoard = new ParkingDisplayBoard();
    List<ParkingSpace> parkingSpaces = new ArrayList<>();
    ParkingFloor parkingFloor = new ParkingFloor(1, parkingSpaces, displayBoard);

    admin.addParkingFloor(parkingLot, parkingFloor);

    System.out.println(parkingLot);
  }
}
