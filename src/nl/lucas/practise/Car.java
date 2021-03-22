package nl.lucas.practise;

public class Car extends Vehicle implements Drivable{

    public Car(String nameOfVehicle, int amountOfWheels, int amountOfDoors, boolean usesGas) {
        super(nameOfVehicle, amountOfWheels, amountOfDoors, usesGas);
    }

    @Override
    public void move() {
        System.out.println("I am moving by driving on a road");
    }

    @Override
    public void drive() {
        System.out.println("I am a car so I drive");
    }
}
