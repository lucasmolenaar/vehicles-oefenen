package nl.lucas.practise;

public class Train extends Vehicle implements Drivable {

    public Train(String nameOfVehicle, int amountOfWheels, int amountOfDoors, boolean usesGas) {
        super(nameOfVehicle, amountOfWheels, amountOfDoors, usesGas);
    }

    @Override
    public void move() {
        System.out.println("I am moving by following a track");
    }

    @Override
    public void drive() {
        System.out.println("I am a train so I drive");
    }
}
