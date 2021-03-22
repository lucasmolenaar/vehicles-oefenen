package nl.lucas.practise;

public class Plane extends Vehicle implements Flyable {

    public Plane(String nameOfVehicle, int amountOfWheels, int amountOfDoors, boolean usesGas) {
        super(nameOfVehicle, amountOfWheels, amountOfDoors, usesGas);
    }

    public void move() {
        System.out.println("I am moving by flying through the air");
    }

    @Override
    public void fly() {
        System.out.println("I am a plane so I fly");
    }
}
