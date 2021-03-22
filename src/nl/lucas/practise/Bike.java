package nl.lucas.practise;

public class Bike extends Vehicle implements Drivable {

    public Bike(String nameOfVehicle, int amountOfWheels, int amountOfDoors, boolean usesGas) {
        super(nameOfVehicle, amountOfWheels, amountOfDoors, usesGas);
    }

    @Override
    public void move() {
        System.out.println("I am moving by riding down a road");
    }

    @Override
    public void drive() {
        System.out.println("I am a bike so I drive");
    }

}
