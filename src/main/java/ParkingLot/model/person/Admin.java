package main.java.ParkingLot.model.person;

import main.java.ParkingLot.model.parking.ParkingFloor;

public abstract class Admin extends Staff {
    public Admin(String name, String age, String address, String emailId) {
        super(name, age, address, emailId);
    }

    public abstract ParkingFloor getFloorInformation(int floorNumber);
}
