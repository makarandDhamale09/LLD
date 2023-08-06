package lld.observerPattern;

import lld.observerPattern.observable.IphoneStockObservable;
import lld.observerPattern.observer.EmailAlertObserver;
import lld.observerPattern.observer.MobileAlertObserver;

/**
 * This design pattern was asked in the Walmart interview
 *
 * <p>Question : Implement 'Notify me' that we see in the Products on Amazon that are out of stock.
 * Once the product comes in stock we need to send the notification to all the customers who had
 * clicked on notify me.
 *
 * <p><B><I>Implementation : </I></B> To implement this we have two objects one is 'Observable' and
 * the other is Observer. When the state of Observable changes it updates the Observer
 */
public class Main {
  public static void main(String[] args) {
    var iphoneStockObservable = new IphoneStockObservable();

    var observer1 = new EmailAlertObserver("abc@gmail.com", iphoneStockObservable);
    var observer2 = new EmailAlertObserver("xyz@gmail.com", iphoneStockObservable);
    var observer3 = new MobileAlertObserver("xyz_username", iphoneStockObservable);

    iphoneStockObservable.add(observer1);
    iphoneStockObservable.add(observer2);
    iphoneStockObservable.add(observer3);

    // when the stock gets updated all the observers will be notified
    iphoneStockObservable.updateStockCount(10);

    iphoneStockObservable.setStockCount(0);

    // second notification will be sent again
    iphoneStockObservable.updateStockCount(10);
  }
}
