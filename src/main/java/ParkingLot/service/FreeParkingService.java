package main.java.ParkingLot.service;

import main.java.ParkingLot.model.ticket.Ticket;

public class FreeParkingService implements IFreeParkingService{

    ParkingService parkingService;

    public FreeParkingService(ParkingService parkingService){
        this.parkingService = parkingService;
    }

    @Override
    public double freeParking(Ticket ticket) {
        return parkingService.freeParking(ticket);
    }
}