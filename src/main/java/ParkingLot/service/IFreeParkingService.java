package main.java.ParkingLot.service;

import main.java.ParkingLot.model.ticket.Ticket;

public interface IFreeParkingService {
    // returns cost
    public double freeParking(Ticket ticket);
}