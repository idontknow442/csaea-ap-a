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
        System.out.println("A window has been broken. Remaining windows: " + windows);
    }

    public void turnOnLight() {
        isLightOn = true;
        System.out.println("The light is now on.");
    }

    public void turnOffLight() {
        isLightOn = false;
        System.out.println("The light is now off.");
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

    public void attributes() {
        System.out.println("Material: " + material);
        System.out.println("Rooms: " + rooms);
        System.out.println("Floors: " + floors);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Windows: " + windows);
        System.out.println("Square Footage: " + squareFootage);
        System.out.println("Is Occupied: " + isOccupied);
        System.out.println("Is Light On: " + isLightOn);
    }


    

}
