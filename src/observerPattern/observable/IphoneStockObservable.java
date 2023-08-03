package observerPattern.observable;

import observerPattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable {

    List<NotificationAlertObserver> observers = new ArrayList<>();
    private int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (NotificationAlertObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    @Override
    public void updateStockCount(int newStockAdded) {
        if (stockCount == 0) {
            notifyObserver();
        }
        stockCount = stockCount + newStockAdded;
    }
}
