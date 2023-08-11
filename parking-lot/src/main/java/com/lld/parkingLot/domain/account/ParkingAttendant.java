package com.lld.parkingLot.domain.account;

import com.lld.parkingLot.domain.payment.Payment;
import com.lld.parkingLot.domain.payment.PaymentInfo;
import com.lld.parkingLot.domain.payment.PaymentType;
import com.lld.parkingLot.domain.ticket.ParkingTicket;
import com.lld.parkingLot.domain.vehicle.Vehicle;

public class ParkingAttendant extends Account {
  Payment paymentService;

  public boolean processVehicleEntry(Vehicle vehicle) {
    return false;
  }

  public PaymentInfo processPayment(ParkingTicket parkingTicket, PaymentType paymentType) {
    return null;
  }
}
