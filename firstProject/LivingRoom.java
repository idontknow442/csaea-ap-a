package firstProject;

public class LivingRoom {
    private String ownerName;
    private int seatingCapacity;
    private double squareFeet;
    private boolean isOrganized;

    public LivingRoom(String ownerName, double squareFeet) {
        this.ownerName = ownerName;
        this.squareFeet = squareFeet;
        this.seatingCapacity = 5;
        this.isOrganized = true;
    }

    public void cleanRoom() {
        this.isOrganized = true;
    }

    public void messRoom() {
        this.isOrganized = false;
    }

    public String toString() {
        return "Owner: " + ownerName + ", Seating: " + seatingCapacity + " seats, Size: " + squareFeet + " sq ft, Organized: " + isOrganized;
    }

    public boolean isCorrectOwner(String targetName) {
        return this.ownerName.equals(targetName);
    }

    public boolean checkFirstName(String sub) {
        String firstName = this.ownerName.substring(0, this.ownerName.indexOf("."));
        int index = this.ownerName.indexOf(firstName.substring(0));
        return index != -1 && firstName.contains(sub);
    }

    public double calculateCleaningCost(double costPerSqFt) {
        return this.squareFeet * costPerSqFt;
    }
}