package CrashCourse;

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



}
