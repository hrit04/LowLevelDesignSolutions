




package main.java.ObserverDesignPattern;


import main.java.ObserverDesignPattern.Observable.IphoneObservableImpl;
import main.java.ObserverDesignPattern.Observable.StockObservable;
import main.java.ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import main.java.ObserverDesignPattern.Observer.MobileAlertObserverImpl;
import main.java.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Main {

    public static void main(String[] args) {

        StockObservable iphoneStockObservable=new IphoneObservableImpl();

        NotificationAlertObserver observer1=new EmailAlertObserverImpl("abc@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2=new EmailAlertObserverImpl("xyz@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3=new MobileAlertObserverImpl("abc_username", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }
}