package main.java.ParkingLot.service;

import main.java.ParkingLot.model.gate.ParkingEntryGate;
import main.java.ParkingLot.model.ticket.Ticket;
import main.java.ParkingLot.model.vehicle.Vehicle;

public class BookParkingService implements IBookParkingService {

    ParkingService parkingService;

    public BookParkingService(ParkingService parkingService){
        this.parkingService = parkingService;
    }

    @Override
    public Ticket bookParking(int parkingEntryGateNumber, Vehicle vehicle) {
        return parkingService.bookParking(parkingEntryGateNumber, vehicle);
    }
}
