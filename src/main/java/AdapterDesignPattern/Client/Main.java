package main.java.AdapterDesignPattern.Client;

import main.java.AdapterDesignPattern.Adaptee.WeightMachineForBabies;
import main.java.AdapterDesignPattern.Adapter.WeightMachineAdapter;
import main.java.AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;

public class Main {

    public static void main(String args[]){

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}

