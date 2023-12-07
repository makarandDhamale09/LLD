import java.util.concurrent.atomic.AtomicInteger;

public class TicketCounter {

  private AtomicInteger availableTickets = new AtomicInteger(10);

  public synchronized Ticket bookTickets(String name, int noOfTickets) {
    try {
      if (noOfTickets <= availableTickets.get()) {
        availableTickets.getAndUpdate(i -> i - noOfTickets);
        Thread.sleep(1000);
        System.out.println("Ticket Booked for " + name + " No of Tickets :" + noOfTickets);
        System.out.println("Available tickets : " + availableTickets);
        return new Ticket(name, noOfTickets);
      }
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
    System.out.println("Sorry Tickets are not available for " + name);
    return null;
  }
}
