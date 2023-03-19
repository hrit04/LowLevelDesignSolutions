package main.java.ParkingLot.model.vehicle;

import main.java.ParkingLot.model.person.VehicleOwner;

public class FourWheelerVehicle extends Vehicle{

    public FourWheelerVehicle(VehicleOwner vehicleOwner, String vehicleNumber) {
        super(vehicleOwner, vehicleNumber, VehicleCategoryWithCost.FOURWHEELER);
    }
}