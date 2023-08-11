package com.lld.parkingLot.domain.vehicle;

import com.lld.parkingLot.domain.payment.PaymentInfo;
import com.lld.parkingLot.domain.ticket.ParkingTicket;

public class Vehicle {
  String licenceNumber;
  VehicleType vehicleType;
  ParkingTicket parkingTicket;
  PaymentInfo paymentInfo;
}
