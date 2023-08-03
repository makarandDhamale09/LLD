package observerPattern.observable;

import observerPattern.observer.NotificationAlertObserver;

public interface StockObservable {

    void add(NotificationAlertObserver observer);

    void remove(NotificationAlertObserver observer);

    void notifyObserver();

    void updateStockCount(int newStockAdded);

    int getStockCount();
}
