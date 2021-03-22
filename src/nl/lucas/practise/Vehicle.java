package nl.lucas.practise;

public class Vehicle {
    private String nameOfVehicle;
    private int amountOfWheels;
    private int amountOfDoors;
    private boolean usesGas;

    public Vehicle(String nameOfVehicle, int amountOfWheels, int amountOfDoors, boolean usingGas) {
        this.nameOfVehicle = nameOfVehicle;
        this.amountOfWheels = amountOfWheels;
        this.amountOfDoors = amountOfDoors;
        this.usesGas = usingGas;
    }

    //GETTERS
    public String getNameOfVehicle() {
        return nameOfVehicle;
    }

    public int getAmountOfWheels() {
        return amountOfWheels;
    }

    public int getAmountOfDoors() {
        return amountOfDoors;
    }

    public boolean isUsesGas() {
        return usesGas;
    }

    public void move() {
        System.out.println("I am moving because I am a vehicle");
    }
}
