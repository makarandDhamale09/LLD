package lld.parkingLot.domain;

import java.time.Duration;
import java.time.LocalDateTime;
import lld.parkingLot.domain.spot.ParkingSpot;

public class ParkingTicket {
  private final int id;
  private final String vehicalNo;
  private final LocalDateTime startTime;
  private final ParkingSpot parkingSpot;
  private double price;

  public ParkingTicket(
      int id, String vehicalNo, LocalDateTime startTime, ParkingSpot parkingSpot, double price) {
    this.id = id;
    this.vehicalNo = vehicalNo;
    this.startTime = startTime;
    this.parkingSpot = parkingSpot;
    this.price = price;
  }

  public int getId() {
    return id;
  }

  public String getVehicalNo() {
    return vehicalNo;
  }

  public LocalDateTime getStartTime() {
    return startTime;
  }

  public double getPrice() {
    Duration duration = Duration.between(startTime, LocalDateTime.now());
    long hours = duration.toHours();
    return price + hours * 10;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public ParkingSpot getParkingSpot() {
    return parkingSpot;
  }
}
