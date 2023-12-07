public class TicketBooking {
  public static void main(String[] args) {
    TicketCounter counter = new TicketCounter();

    for (int i = 0; i < 20; i++) {
      int finalI = i;
      new Thread(() -> counter.bookTickets("I-" + finalI, 1)).start();
    }
  }
}
