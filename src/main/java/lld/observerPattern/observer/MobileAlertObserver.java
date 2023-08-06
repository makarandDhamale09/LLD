package lld.observerPattern.observer;

import lld.observerPattern.observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver {
  private final String userName;
  private final StockObservable observable;

  public MobileAlertObserver(String userName, StockObservable observable) {
    this.userName = userName;
    this.observable = observable;
  }

  @Override
  public void update() {
    sendMsg(userName, "product is in stock hurry up !!");
  }

  private void sendMsg(String emailId, String message) {
    // send email to user
    System.out.println("message sent to : " + emailId + " with message : " + message);
  }
}
