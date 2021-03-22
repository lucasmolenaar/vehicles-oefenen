package nl.lucas.practise;

public class Boat extends Vehicle implements Sailable {

    public Boat(String nameOfVehicle, int amountOfWheels, int amountOfDoors, boolean usesGas) {
        super(nameOfVehicle, amountOfWheels, amountOfDoors, usesGas);
    }

    @Override
    public void move() {
        System.out.println("I am moving by sailing over water");
    }

    @Override
    public void sail() {
        System.out.println("I am a boat so I sail");
    }
}
