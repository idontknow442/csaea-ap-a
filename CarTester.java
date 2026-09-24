public class CarTester {

    public static void main(String[] args) {

        Car carOne = new Car("Honda", "SUV", "Blue");
        Car carTwo = new Car("Mazda", "Sedan", "Red");

        carOne.carInfo();
        carOne.changeOwner("Jake");
        carOne.doorRemoval();
        carOne.windowBroke();
        carOne.driveCar();
        carTwo.newParts("Engine", 300);
        carTwo.refuelCar();
        carTwo.startCar();
        carTwo.driveCar();
        carTwo.parkCar();

    }
    
}
