public class House {
    
    private String material;
    private int rooms;
    private String ownerName;
    private int windows;
    private int floors;
    private double squareFootage;
    private boolean isOccupied;
    private boolean isLightOn;

    public House(String material, int rooms, int floors) {

        this.material = material;
        this.rooms = rooms;
        this.floors = floors;
        ownerName = "Unknown";
        windows = 8;
        isOccupied = false;
        isLightOn = false;
        squareFootage = 1500.0;

    }

    public void newOwner(String name) {
        ownerName = name;
        System.out.println("The new owner of the house is " + ownerName);

    }

    public void breakWindow() {
        windows--;
    }

    public void turnOnLight() {
        isLightOn = true;
    }

    public void turnOffLight() {
        isLightOn = false;
    }

    public void enterHouse() {
        isOccupied = true;
        System.out.println("The house is now occupied.");
    }

    public void exitHouse() {
        isOccupied = false;
        System.out.println("The house is now unoccupied.");
    }

    public void houseDestruction() {
        squareFootage -= 100.0;
        System.out.println("The house has been damaged. Square footage: " + squareFootage);
    }


    

}
