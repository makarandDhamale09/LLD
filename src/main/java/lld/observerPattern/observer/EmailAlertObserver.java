package lld.observerPattern.observer;

import lld.observerPattern.observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver {

  private final String emailId;
  private final StockObservable observable;

  public EmailAlertObserver(String emailId, StockObservable observable) {
    this.emailId = emailId;
    this.observable = observable;
  }

  @Override
  public void update() {
    sendEmail(emailId, "product is in stock hurry up !!");
  }

  private void sendEmail(String emailId, String message) {
    // send email to user
    System.out.println("mail sent to : " + emailId + " with message : " + message);
  }
}
