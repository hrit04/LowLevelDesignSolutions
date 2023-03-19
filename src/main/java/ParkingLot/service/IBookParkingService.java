package main.java.ParkingLot.service;


import main.java.ParkingLot.model.ticket.Ticket;
import main.java.ParkingLot.model.vehicle.Vehicle;

public interface IBookParkingService {
    // return ticket
    Ticket bookParking(int parkingGateNumber, Vehicle vehicle);
}