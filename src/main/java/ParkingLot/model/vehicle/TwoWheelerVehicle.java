package main.java.ParkingLot.model.vehicle;

import main.java.ParkingLot.model.person.VehicleOwner;

public class TwoWheelerVehicle extends Vehicle{

    public TwoWheelerVehicle(VehicleOwner vehicleOwner, String vehicleNumber) {
        super(vehicleOwner, vehicleNumber, VehicleCategoryWithCost.TWOWHEELER);
    }

}