package nl.lucas.practise;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Car",4, 5, true);
        printInfo(car);
        car.move();
        car.drive();
        usingGas(car);

        System.out.println();

        Boat boat = new Boat("Boat",0, 0, true);
        printInfo(boat);
        boat.move();
        boat.sail();
        usingGas(boat);

        System.out.println();

        Train train = new Train("Train", 100, 20, false);
        printInfo(train);
        train.move();
        train.drive();
        usingGas(train);

        System.out.println();

        Bike bike = new Bike("Bike",2, 0, false);
        printInfo(bike);
        bike.move();
        bike.drive();
        usingGas(bike);

        System.out.println();

        Plane plane = new Plane("Plane",4, 6, true);
        printInfo(plane);
        plane.move();
        plane.fly();
        usingGas(plane);
    }

    public static void usingGas(Vehicle vehicle) {
        if (!vehicle.isUsesGas()) {
            System.out.println("I am not using gas");
        } else {
            System.out.println("I am using gas");
        }
    }

    public static void printInfo(Vehicle vehicle) {
        System.out.println("I am a "
                + vehicle.getNameOfVehicle()
                + ". I have "
                + vehicle.getAmountOfWheels()
                + " wheels and "
                + vehicle.getAmountOfDoors() + " doors.");
    }
}
