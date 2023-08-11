package com.lld.parkingLot.domain.ticket;

import com.lld.parkingLot.domain.floor.ParkingSpaceType;
import java.util.Date;

public class ParkingTicket {
  int tickeId;
  int levelId;
  int spaceId;
  Date vehicleEntryDateTime;
  Date vehicleExitDateTime;
  ParkingSpaceType parkingSpaceType;
  double totalCost;
  ParkingTicketStatus parkingTicketStatus;

  public void updateTotalCost() {}

  public void updateVehicleExitTime(Date vehicleExitDateTime) {}
}
