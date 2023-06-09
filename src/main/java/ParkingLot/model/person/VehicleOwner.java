package main.java.ParkingLot.model.person;

import main.java.ParkingLot.model.vehicle.Vehicle;

public class VehicleOwner extends Person{
    private Vehicle vehicle;

    public VehicleOwner(String name, String age, String address, String emailId) {
        super(name, age, address, emailId);
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}