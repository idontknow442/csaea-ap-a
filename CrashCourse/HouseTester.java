public class HouseTester {

    public static void main(String[] args) {

        House houseOne = new House("Wood", 13, 3);
        House houseTwo = new House("Brick", 8, 2);
        House houseThree = new House("Stone", 4, 1);
        House houseFour = new House("Concrete", 9, 2);
        House houseFive = new House("Steel", 15, 3);

        houseTwo.newOwner("Dilshan");
        houseTwo.breakWindow();
        houseThree.turnOnLight();
        houseThree.turnOffLight();
        houseFour.enterHouse();
        houseFour.exitHouse();
        houseFive.houseDestruction();
        houseFive.attributes();
    }
    
}
