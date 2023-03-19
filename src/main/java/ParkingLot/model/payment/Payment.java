package main.java.ParkingLot.model.payment;

import main.java.ParkingLot.model.person.Person;

public abstract class Payment {
    Person person;
    double price;
    PaymentCategory paymentCategory;

    public Payment(PaymentCategory paymentCategory){
        this.paymentCategory = paymentCategory;
    }
}