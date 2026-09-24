public class Car {
    
    private String carCompany;
    private String carModel;
    private String carColor;
    private int carMileage;
    private boolean isElectric;
    private int windowCount;
    private int doorCount;
    private boolean isRunning;
    private boolean isDriving;
    private boolean isParked;
    private boolean gasTankFull;
    private int carWeight;
    private String carLicensePlate;
    private String ownerName;

    public Car(String carCompany, String carModel, String carColor) {
        
        this.carCompany = carCompany;
        this.carModel = carModel;
        this.carColor = carColor;

        carMileage = 0;
        isElectric = false;
        windowCount = 4;
        doorCount = 4;
        isRunning = false;
        isDriving = false;
        isParked = true;
        gasTankFull = true;
        carWeight = 3000;
        carLicensePlate = "123-ABC";
        ownerName = "Dilshan";

    }
  
    public void startCar() {
        isRunning = true;
        isParked = true;
        System.out.println("The car has started.");
    }

    public void driveCar() {
        if (isRunning && gasTankFull) {
            isDriving = true;
            isParked = false;
            System.out.println("The car is now driving.");
        } else {
            System.out.println("The car cannot drive. Make sure the car is on and the gas tank is full.");
        }
    }

    public void parkCar() {
        if (isDriving) {
            isDriving = false;
            isParked = true;
            System.out.println("The car is now parked.");
        }
    }   

    public void refuelCar() {
        gasTankFull = true;
        System.out.println("The car has been refueled.");
    }

    public void changeOwner(String newOwner) {
        ownerName = newOwner;
        System.out.println("The new owner of the car is" + " " + ownerName);
    }

    public void windowBroke() {

        windowCount --;
        System.out.println("There are " + windowCount + " " + "left.");
    }

    public void doorRemoval() {

        doorCount --;
        System.out.println("There are " + doorCount + " " + "left.");
    }

    public void newParts(String partName,  int Weight) {

        carWeight += Weight;
        System.out.println("The car weight is now" + " " + carWeight);
    }


    public void carInfo() {

        System.out.println(carCompany);
        System.out.println(carModel);
        System.out.println(carColor);
        System.out.println(carMileage);
        System.out.println(carWeight);
        System.out.println(carLicensePlate);
        System.out.println(ownerName);
    }

}

